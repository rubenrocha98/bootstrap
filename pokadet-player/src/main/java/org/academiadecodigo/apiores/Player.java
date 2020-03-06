package org.academiadecodigo.apiores;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Player {

    private Socket clientSocket = null;
    private BufferedReader in;
    private PrintWriter out;
    private Scanner scanner;
    private Prompt prompt;
    private String host;
    private int port;

    public static void main(String[] args) {
        Player player = new Player();
        player.connect();
    }

    public void connect() {

        getPlayerInput();

        Executor executor = Executors.newSingleThreadExecutor();

        try {
            clientSocket = new Socket(host, port);

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            ReadFromServer read = new ReadFromServer();

            String choice;

            while (clientSocket.isBound()) {

                executor.execute(read);

                choice = getChoice();

                out.println(choice);
            }

            close(scanner);
            close(clientSocket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromServer(BufferedReader in) throws IOException {

        while (clientSocket.isBound()) {
            System.out.println(in.readLine());
        }
    }

    private void getPlayerInput() {

        prompt = new Prompt(System.in, System.out);

        StringInputScanner hostQuestion = new StringInputScanner();
        hostQuestion.setMessage("Host? ");
        host = prompt.getUserInput(hostQuestion);

        IntegerInputScanner portQuestion = new IntegerInputScanner();
        portQuestion.setMessage("Port? ");
        port = prompt.getUserInput(portQuestion);
    }

    private String getChoice() {
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    private void close(Closeable closeable) {

        if (closeable == null) {
            return;
        }

        try {
            closeable.close();
        } catch (IOException e) {
            System.err.println("Error closing stream: " + e.getMessage());
        }
    }

    //Runnable class
    public class ReadFromServer implements Runnable {

        public void run() {

            try {
                readFromServer(in);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
