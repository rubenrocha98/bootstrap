package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.server.Server;
import org.academiadecodigo.apiores.services.PokadetService;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bootstrap {

    private Map<Integer, Pokadet> pokadetMap;

    public Bootstrap() {
        pokadetMap = new HashMap<>();
    }

    Server wire(){

        Server server = new Server();

        PokadetController pokadetController = new PokadetController();
        pokadetController.setPokadetMap(getMap());
        server.setPokadetController(pokadetController);
        
        PokadetService pokadetService = new PokadetService();
        pokadetController.setPokadetService(pokadetService);
        pokadetService.setPokadetController(pokadetController);



        return server;
    }



    private Map<Integer, Pokadet> getMap(){
        return null;
    }

    private String[] getNames(){
        Map <Integer,Pokadet> map = getMap();
        String [] names = new String[map.size()];
        for (int i = 0; i < names.length; i++) {
            names[i]=map.get(i+1).getName();
        }
        return names;
    }
}
