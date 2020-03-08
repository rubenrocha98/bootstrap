package org.academiadecodigo.apiores.services;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.Target;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.models.trainers.BoostType;
import org.academiadecodigo.apiores.models.trainers.Trainer;
import org.academiadecodigo.apiores.view.Messages;

public class PokadetService {

    private Pokadet pokadet1;
    private Pokadet pokadet2;
    private PokadetController pokadetController;
    private Pokadet currentPokadet;
    private Pokadet targetPokadet;


    public String hit(int abilityPick) {
        Ability ability = currentPokadet.getAbility(abilityPick);

        if (ability.getTarget().equals(Target.SELF)) {
            if(currentPokadet.getHp() + ability.getAmount() > currentPokadet.getMaxHP()){
                currentPokadet.setHp(currentPokadet.getMaxHP());
                return ability.getName();
            }
            currentPokadet.setHp(currentPokadet.getHp() + ability.getAmount());
            return ability.getName();
        }
        chooseTargetPokadet();
        int damage = attack(ability.getAmount());
        return ability.getName() + " hit for "+damage+"hp\n";
    }

    private int attack(int amount){
        int defense = targetPokadet.getDefense();
        int attack = currentPokadet.getAttack();
        int damage = amount;
        if (checkCrit()){
            damage = (int) Math.floor(amount * 1.2);
        }
        damage -= defense;
        damage += attack;
        if(damage < 0 ){
            damage = 0;
        }
        System.out.println("Damage dealt: " + damage);
        targetPokadet.setHp(targetPokadet.getHp() - damage);
        return damage;
    }

    private boolean checkCrit(){
        int random = ((int) (Math.ceil(Math.random()*100)));
        return random <= currentPokadet.getCritChance();
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
            pokadetController.setWinner(pokadet2);
            return false;
        }
        if (!pokadet2.isAlive()) {
            pokadetController.setWinner(pokadet1);
            return false;
        }
        return true;
    }

    public void implementTrainersBoost(Trainer trainer){
        BoostType boost = trainer.getBoost();
        int amount = trainer.getAmount();
        switch (boost){
            case HP:
                currentPokadet.setMaxHP(currentPokadet.getMaxHP() + amount);
                currentPokadet.setHp(currentPokadet.getMaxHP());
                break;
            case ATTACK:
                currentPokadet.setAttack(currentPokadet.getAttack() + amount);
                break;
            case DEFENSE:
                currentPokadet.setDefense(currentPokadet.getDefense() + amount);
                break;
            case CRITICAL:
                currentPokadet.setCritChance(currentPokadet.getCritChance() + amount);
                break;
        }
    }

    public String[] getAbilities() {
        return Messages.abilitiesMenu(currentPokadet);
    }

    public String getPokadetInfo(Pokadet pokadet) {
        return Messages.getStats(pokadet);
    }

    public String getInfo(){
        return Messages.getStats(currentPokadet);
    }

    public String getDoubleInfo(){
        if(currentPokadet.equals(pokadet1)){
            return Messages.getStats(currentPokadet, pokadet2);
        }

        return Messages.getStats(currentPokadet,pokadet1);

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

