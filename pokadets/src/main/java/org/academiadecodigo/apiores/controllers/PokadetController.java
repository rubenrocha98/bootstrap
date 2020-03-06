package org.academiadecodigo.apiores.controllers;

import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.services.PokadetService;

import java.util.HashMap;
import java.util.Map;

public class PokadetController {

    private Pokadet loser;
    private PokadetService pokadetService;
    private Map<Integer,Pokadet> pokadetMap;
    private boolean gameOver;


    public PokadetController() {
        this.pokadetMap = new HashMap<>();
        gameOver = false;
    }

    public void init(int currentPlayer, int abilityPick){

        pokadetService.setCurrentPokadet(pokadetMap.get(currentPlayer));

        pokadetService.hit(abilityPick);


        if(pokadetService.verifyAlive()){


            gameOver = true;
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

    public void addPokadets(int pokadetId1, int pokadetId2){

        pokadetService.setPokadet1(pokadetMap.get(pokadetId1));
        pokadetService.setPokadet2(pokadetMap.get(pokadetId2));

    }

    public boolean isGameOver() {
        return gameOver;
    }
}
