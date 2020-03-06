package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.server.Server;

public class Main {

    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();

        Server server = bootstrap.wire();

        server.init();
    }
}
