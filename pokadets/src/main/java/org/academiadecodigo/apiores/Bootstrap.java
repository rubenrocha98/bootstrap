package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.services.PokadetService;

import java.util.Map;

public class Bootstrap {



    PokadetController wire(){
        PokadetController pokadetController = new PokadetController();
        pokadetController.setPokadetMap(getMap());

        
        PokadetService pokadetService = new PokadetService();
        pokadetController.setPokadetService(pokadetService);
        pokadetService.setPokadetController(pokadetController);



        return pokadetController;
    }



    private Map<Integer, Pokadet> getMap(){
        return null;
    }
}
