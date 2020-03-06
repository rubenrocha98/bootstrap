package org.academiadecodigo.apiores.server;

import org.academiadecodigo.bootcamp.Prompt;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class PlayerManager {
    private Socket playerSocket;
    PrintStream out;


    public PlayerManager(Socket playerSocket) {
        this.playerSocket = playerSocket;
    }


    public void dispatch(Prompt prompt) {
        try {
            out = new PrintStream(playerSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void close(){
        try {
            out.close();
            playerSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
