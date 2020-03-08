package org.academiadecodigo.apiores.controllers;

import org.academiadecodigo.apiores.Bootstrap;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.models.trainers.Trainer;
import org.academiadecodigo.apiores.services.PokadetService;
import org.academiadecodigo.apiores.view.Messages;

import java.util.HashMap;
import java.util.Map;

public class PokadetController {


    private PokadetService pokadetService;
    private Map<Integer,Pokadet> pokadetMap;
    private boolean gameOver;
    private int pokadetId1;
    private int pokadetId2;


    public PokadetController() {
        this.pokadetMap = new HashMap<>();
        gameOver = false;
    }

    public String init(int currentPlayer, int abilityPick){
        if(currentPlayer==1) {
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId1));
        }else {
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId2));
        }

        String ability = pokadetService.hit(abilityPick);


        if(!pokadetService.verifyAlive()){
            gameOver = true;
            return ability ;
        }
        return ability;

    }

    public String getCurrentHp(){
        return pokadetService.getCurrentPokadetHp();
    }

    public String getTargetHp(){
        return pokadetService.getTargetPokadetHp();
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

    public void setCurrentPokadet(int currentPlayerId){
        if(currentPlayerId==1) {
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId1));
        }else{
            pokadetService.setCurrentPokadet(pokadetMap.get(pokadetId2));
        }
    }
    public String getPokadetInfo(int pokadetId){
        Pokadet pokadet = this.pokadetMap.get(pokadetId);
        return pokadetService.getPokadetInfo(pokadet);
    }


    public String getDoubleInfo(){
        return pokadetService.getDoubleInfo();
    }

    public void pickTrainer(int choice){
        pokadetService.implementTrainersBoost(Trainer.values()[choice-1]);
    }

    public void resetGame(){
        Bootstrap.setPokadetsStats(pokadetMap);
        gameOver = false;
        Bootstrap.addPokeAbilities(pokadetMap);
    }


}
