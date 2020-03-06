package org.academiadecodigo.apiores.services;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.Target;
import org.academiadecodigo.apiores.models.cadets.Pokadet;

public class PokadetService {

    Pokadet pokadet1;
    Pokadet pokadet2;
    PokadetController pokadetController;
    private Pokadet currentPokadet;
    private Pokadet targetPokadet;


    public void hit(int abilityPick) {
        Ability ability = currentPokadet.getAbility(abilityPick);

        if (ability.getTarget().equals(Target.SELF)) {
            currentPokadet.setHp(currentPokadet.getHp() + ability.getAmount());
            return;
        }
        chooseTargetPokadet();
        targetPokadet.setHp(targetPokadet.getHp() - ability.getAmount());
    }

    private void chooseTargetPokadet() {
        if (currentPokadet == pokadet1) {
            targetPokadet = pokadet2;
        }
        if (currentPokadet == pokadet2) {
            targetPokadet = pokadet1;
        }
    }

    public boolean verifyAlive() {
        if (!pokadet1.isAlive()) {
            pokadetController.setLoser(pokadet1);
            return false;
        }
        if (!pokadet2.isAlive()) {
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

    public void setCurrentPokadet(Pokadet currentPokadet) {
        this.currentPokadet = currentPokadet;
    }

    public void setPokadetController(PokadetController pokadetController) {
        this.pokadetController = pokadetController;
    }
}
