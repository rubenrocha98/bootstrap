package org.academiadecodigo.apiores.server;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.view.Messages;
import org.academiadecodigo.apiores.view.scanner.Scanners;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static final int PORT = 8000;

    private ServerSocket serverSocket = null;
    private PokadetController pokadetController;
    private HashMap<Integer, Integer> playerOption; //currentPlayer , pokadet choice
    private HashMap<Socket, Integer> socketMap; //clientSocker , currentPlayer
    private int playerId = 0;
    private String ability="";


    public Server() {
        socketMap = new HashMap<>();
        playerOption = new HashMap<>();
    }

    public void setPokadetController(PokadetController pokadetController) {
        this.pokadetController = pokadetController;
    }

    public void init() {
        try {

            serverSocket = new ServerSocket(PORT);

            listen();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //metodo esta muito grande!!
    private void serve(Socket clientSocket) {

        PrintStream out = null;
        InputStream in = null;

        try {

            in = new DataInputStream(clientSocket.getInputStream());
            out = new PrintStream(clientSocket.getOutputStream(), true);
            Prompt prompt = new Prompt(in, out);

            playerId++;

            socketMap.put(clientSocket, playerId);

            if(!beggining(out, prompt, clientSocket)){
                if(playerOption.size()==2){
                    playerOption.remove(socketMap.get(clientSocket));
                }
                playerId=socketMap.remove(clientSocket)-1;
                return;
            }


            MenuInputScanner abilities;
            //fight
            while (!pokadetController.isGameOver()) {
                synchronized (this) {
                    notifyAll();
                    out.println(Messages.WAITING_OPONENT);
                    wait();



                    if(!ability.equals("")) {
                        out.println(Messages.ABILITY_USED_ENEMY + ability);
                    }

                    if(pokadetController.isGameOver()){
                        out.println(Messages.LOOSER);
                        break;
                    }

                    abilities = new MenuInputScanner(pokadetController.getAbilitiesOptions(socketMap.get(clientSocket)));
                    abilities.setMessage(pokadetController.getDoubleInfo()+Messages.ABILITY_TO_USE);
                    int abilityPick = prompt.getUserInput(abilities);

                    ability = pokadetController.init(socketMap.get(clientSocket), abilityPick);
                    out.println(Messages.ABILITY_USED_YOU+ability);
                    notifyAll();
                    if(pokadetController.isGameOver()){
                        out.println(Messages.WINNER);
                    }

                }
            }

            gameOver(prompt, clientSocket);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("\nPlayer Disconected");
        }
        try {
            out.close();
            in.close();
        } catch (IOException e) {
            //e.printStackTrace();

        }


    }

    private void listen() {


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (true) {
            try {

                Socket clientSocket = serverSocket.accept();

                executorService.submit(new ServerThread(clientSocket));
                System.out.println("New Player Connected");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void printWelcomeMessage(PrintStream out){

        String welcomeMessage = Messages.WELCOME;

        for (int i=0; i< welcomeMessage.length(); i++ ){
            try {
                out.print(welcomeMessage.charAt(i));
                Thread.sleep(0,500);
            } catch (InterruptedException e){
                System.err.println("problem printing welcome slowly");
            }
        }

    }

    private int checkPlayers(Prompt prompt, MenuInputScanner menuInputScanner, PrintStream out,Socket clientSocket){

        //Player Pick
        int playerPick = prompt.getUserInput(menuInputScanner);







        String pokadetStats = pokadetController.getPokadetInfo(playerPick); // pedir stats ao controller;


        MenuInputScanner showPokadetStatsMenu = new MenuInputScanner(Messages.SELECT_POKADET);
        showPokadetStatsMenu.setMessage(pokadetStats + Messages.CONTINUE);

        if (prompt.getUserInput(showPokadetStatsMenu) == 2) {
            playerOption.remove(socketMap.get(clientSocket));
            return checkPlayers(prompt,menuInputScanner,out,clientSocket);
        }

        if(playerOption.containsValue(playerPick)) {
            out.println(Messages.POKADET_PICKED);
            return checkPlayers(prompt,menuInputScanner,out,clientSocket);
        }
        playerOption.put(socketMap.get(clientSocket),playerPick);
        return playerPick;

    }

    private void chooseTrainer(Prompt prompt,Socket clientSocket) {

        int choice = prompt.getUserInput(Scanners.getTrainersMenu());
        pokadetController.setCurrentPokadet(socketMap.get(clientSocket));
        pokadetController.pickTrainer(choice);
    }

    public synchronized void setPlayers() {

        pokadetController.addPokadets(playerOption.get(1),playerOption.get(2));

    }

    private boolean beggining(PrintStream out, Prompt prompt, Socket clientSocket){

        // welcome message
        MenuInputScanner menuInputScanner0 = new MenuInputScanner(Messages.OPEN_MENU);
        menuInputScanner0.setMessage(Messages.SELECT_OPTION);

        MenuInputScanner menuInputScanner = new MenuInputScanner(pokadetController.getPokadetOptions());
        menuInputScanner.setMessage(Messages.CHOOSE_PLAYER);
        printWelcomeMessage(out);

        int playerPick0 = prompt.getUserInput(menuInputScanner0);

        // if quit Game
        if (playerPick0 ==2){
            out.println(Messages.QUIT);
            close(clientSocket, out);
            return false;
        }

        // Method Checking player Picked
        checkPlayers(prompt, menuInputScanner, out,clientSocket);

        // insert player selected on map

        if(playerOption.size()<2){
            out.println(Messages.WAITING_PLAYER);
        }

        while(playerOption.size() <2){
            System.out.print("");
        }
        ///////////////////////////////////if()
        setPlayers();

        chooseTrainer(prompt,clientSocket);
        return true;
    }

    private void close(Socket clientSocket, PrintStream out){

        try {
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void gameOver(Prompt prompt, Socket clientSocket) {

        playerId = 0;
        pokadetController.resetGame();
        MenuInputScanner finalMenu = new MenuInputScanner(Messages.RESTART_MENU);
        finalMenu.setMessage(Messages.RESTART);

        int choice = prompt.getUserInput(finalMenu);

        if (choice == 1) {

            if(socketMap.size()==2) {
                socketMap = new HashMap<>();
                playerOption = new HashMap<>();
            }
            serve(clientSocket);
        }

    }

    private class ServerThread implements Runnable {
        private Socket playerSocket;

        public ServerThread(Socket playerSocket) {
            this.playerSocket = playerSocket;
        }

        @Override
        public void run() {
            serve(playerSocket);
        }
    }

}
