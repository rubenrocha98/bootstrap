package org.academiadecodigo.apiores.controllers;

import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.services.PokadetService;
import org.academiadecodigo.apiores.view.Messages;

import java.util.HashMap;
import java.util.Map;

public class PokadetController {

    private Pokadet winner;
    private PokadetService pokadetService;
    private Map<Integer,Pokadet> pokadetMap;
    private boolean gameOver;
    private int pokadetId1;
    private int pokadetId2;


    public PokadetController() {
        this.pokadetMap = new HashMap<>();
        gameOver = false;
    }

    public void init(int currentPlayer, int abilityPick){
        if(currentPlayer==1) {
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId1));
        }else {
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId2));
        }

        pokadetService.hit(abilityPick);


        if(!pokadetService.verifyAlive()){
            gameOver = true;
        }

    }


    public void setWinner(Pokadet winner) {
        this.winner = winner;
    }

    public void setPokadetService(PokadetService pokadetService) {
        this.pokadetService = pokadetService;
    }

    public void setPokadetMap(Map<Integer, Pokadet> pokadetMap) {
        this.pokadetMap = pokadetMap;
    }

    public void addPokadets(int pokadetId1,int pokadetId2){

        this.pokadetId1=pokadetId1;
        pokadetService.setPokadet1(pokadetMap.get(pokadetId1));

        this.pokadetId2=pokadetId2;
        pokadetService.setPokadet2(pokadetMap.get(pokadetId2));

    }

    public boolean isGameOver() {
        return gameOver;
    }

    public Pokadet getWinner() {
        return winner;
    }

    public String[] getPokadetOptions(){
        return Messages.pokadetMenu(pokadetMap);
    }


    public String[] getAbilitiesOptions(int currentPlayer){
        if(currentPlayer==1){
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId1));
        }else{
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId2));
        }

        return pokadetService.getAbilities();

    }

    public String getInfo(){
        return pokadetService.getInfo();
    }
}
