package org.academiadecodigo.apiores.server;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static final int PORT = 8000;

    private ServerSocket serverSocket = null;
    private List<PlayerManager> dataList;
    private PokadetController pokadetController;

    public static void main(String[] args) {
        Server server = new Server();
        server.init();
    }

    public void setPokadetController(PokadetController pokadetController) {
        this.pokadetController = pokadetController;
    }

    public Server() {
        dataList = new CopyOnWriteArrayList<>();
    }


    private void init() {
        try {

            serverSocket = new ServerSocket(PORT);
            listen();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void serve(Socket clientSocket) {
        PrintStream out=null;
        InputStream in = null;
        MenuInputScanner menuInputScanner = new MenuInputScanner(new String[]{"abc","def","gsdag"});
        try {
            in = new DataInputStream(clientSocket.getInputStream());
            out = new PrintStream(clientSocket.getOutputStream(), true);
            Thread.currentThread().setName("Client-" + Thread.currentThread().getId());
            dataList.add(new PlayerManager(clientSocket));

            Prompt prompt = new Prompt(in,out);
            int received;


            while (clientSocket.isBound()) {

                int i = prompt.getUserInput(menuInputScanner);


                System.out.println(i);
               /* System.out.println(received);
                for (ClientManager clientManager : dataList) {
                    if (Thread.currentThread().getName().equals(clientManager.getName())) {
                        continue;
                    }

                    clientManager.dispatch(Thread.currentThread().getName() + ": " + received);
                }*/
            }


            System.out.println(Thread.currentThread().getName() + " disconnected");
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void listen() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();

                executorService.submit(new serverThread(clientSocket));
                System.out.println("New Client connected");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





    private class serverThread implements Runnable {
        private Socket clientSocket;

        public serverThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            serve(clientSocket);
        }
    }



}
