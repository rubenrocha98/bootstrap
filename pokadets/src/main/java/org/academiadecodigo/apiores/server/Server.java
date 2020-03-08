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

            beggining(out, prompt, clientSocket);


            MenuInputScanner abilities;
            //fight
            while (!pokadetController.isGameOver()) {
                synchronized (this) {
                    notifyAll();
                    out.println(Messages.WAITING_OPONENT);
                    wait();

                    if(pokadetController.isGameOver()){
                        break;
                    }

                    abilities = new MenuInputScanner(pokadetController.getAbilitiesOptions(socketMap.get(clientSocket)));
                    abilities.setMessage(pokadetController.getInfo()+Messages.ABILITY_TO_USE);
                    int abilityPick = prompt.getUserInput(abilities);

                    pokadetController.init(socketMap.get(clientSocket), abilityPick);

                    notifyAll();
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

    private int checkPlayers(Prompt prompt, MenuInputScanner menuInputScanner, PrintStream out){

        //Player Pick
        int playerPick = prompt.getUserInput(menuInputScanner);

        while (playerOption.containsValue(playerPick)) {
            out.println("Pokadet already picked");
            playerPick = prompt.getUserInput(menuInputScanner);
        }

        String pokadetStats = pokadetController.getPokadetInfo(playerPick); // pedir stats ao controller;


        MenuInputScanner showPokadetStatsMenu = new MenuInputScanner(Messages.SELECT_POKADET);
        showPokadetStatsMenu.setMessage(pokadetStats + Messages.CONTINUE);

        if (prompt.getUserInput(showPokadetStatsMenu) == 2) {

            playerPick = checkPlayers(prompt,menuInputScanner,out);
        }

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

    private void beggining(PrintStream out, Prompt prompt, Socket clientSocket){

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
            System.exit(0);
        }

        // Method Checking player Picked
        int playerPick = checkPlayers(prompt, menuInputScanner, out);

        // insert player selected on map
        playerOption.put(socketMap.get(clientSocket), playerPick);

        if(playerOption.size()<2){
            out.println(Messages.WAITING_PLAYER);
            System.out.println("server: size"+playerOption.size());
        }

        System.out.println("player option size " + playerOption.size());
        while(playerOption.size() <2){
            System.out.print("");
        }

        setPlayers();

        chooseTrainer(prompt,clientSocket);

    }

    private void gameOver(Prompt prompt, Socket clientSocket) {

        playerId = 0;

        MenuInputScanner finalMenu = new MenuInputScanner(Messages.RESTART_MENU);
        finalMenu.setMessage(Messages.RESTART);

        int choice = prompt.getUserInput(finalMenu);

        if (choice == 1) {

            if(socketMap.size()==2) {
                socketMap = new HashMap<>();
                playerOption = new HashMap<>();
            }

            pokadetController.resetGame();
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
