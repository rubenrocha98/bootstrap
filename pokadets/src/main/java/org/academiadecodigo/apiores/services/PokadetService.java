package org.academiadecodigo.apiores.services;

import org.academiadecodigo.apiores.models.Pokadet;

public class PokadetService {

    Pokadet pokadet1;
    Pokadet pokadet2;
    PokadetController pokadetController;


    boolean verifyAlive(){
        if(!pokadet1.isAlive()){
            pokadetController.setLoser(pokadet1);
            return  false;
        }
        if(!pokadet2.isAlive){
            pokadetController.setLoser(pokadet2);
            return false;
        }
        return true;
    }


    public void setPokadet1(Pokadet pokadet1) {
        this.pokadet1 = pokadet1;
    }

    public void setPokadet2(Pokadet pokadet2) {
        this.pokadet2 = pokadet2;
    }

    public void setPokadetController(PokadetController pokadetController) {
        this.pokadetController = pokadetController;
    }
}
