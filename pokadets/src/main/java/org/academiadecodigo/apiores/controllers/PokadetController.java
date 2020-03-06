package org.academiadecodigo.apiores.controllers;

import org.academiadecodigo.apiores.models.Pokadet;
import org.academiadecodigo.apiores.services.PokadetService;

import java.util.Map;

public class PokadetController {

    private Pokadet loser;
    private PokadetService pokadetService;
    private Map<Integer,Pokadet> pokadetMap;

    public void init(int player1, int player2){

        while(pokadetService.verifyAlive()){


        }

    }


    public void setLoser(Pokadet loser) {
        this.loser = loser;
    }


    public void setPokadetService(PokadetService pokadetService) {
        this.pokadetService = pokadetService;
    }

    public void setPokadetMap(Map<Integer, Pokadet> pokadetMap) {
        this.pokadetMap = pokadetMap;
    }


}
