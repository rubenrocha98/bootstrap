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
    private String crit;


    public String hit(int abilityPick) {
        Ability ability = currentPokadet.getAbility(abilityPick);

        if (ability.getTarget().equals(Target.SELF)) {
            if (currentPokadet.getHp() + ability.getAmount() > currentPokadet.getMaxHP()) {
                currentPokadet.setHp(currentPokadet.getMaxHP());
                targetPokadet=currentPokadet;
                return ability.getName() + "\n";
            }
            targetPokadet=currentPokadet;
            currentPokadet.setHp(currentPokadet.getHp() + ability.getAmount());
            return ability.getName()+"\n";
        }

        chooseTargetPokadet();
        int damage = ability.getAmount();

        if (abilityPick == 2) {
            damage += attackRandom();
            System.out.println("random: " + damage);
        }

        damage = attack(damage);

        return ability.getName() + Messages.YELLOW_BOLD + crit + Messages.ANSI_RESET + "hit for " + Messages.ANSI_RED + damage + "hp" + Messages.ANSI_RESET+"\n";
    }

    public String getCurrentPokadetHp(){
        return "You now have: "+Messages.GREEN_BOLD_BRIGHT + targetPokadet.getHp()+"hp"+Messages.ANSI_RESET;
    }
    public String getTargetPokadetHp(){
        return "Enemy now has: "+Messages.RED_BOLD_BRIGHT+ targetPokadet.getHp()+"hp"+Messages.ANSI_RESET;
    }



    private int attack(int amount) {
        int defense = targetPokadet.getDefense();
        int attack = currentPokadet.getAttack();
        int damage = amount;
        crit = "";
        if (checkCrit()) {
            damage = (int) Math.floor(amount * 1.2);
            crit = " CRITICAL";
        }

        damage -= defense;
        damage += attack;

        if (damage < 0) {
            damage = 0;
        }

        System.out.println("Damage dealt: " + damage);
        targetPokadet.setHp(targetPokadet.getHp() - damage);
        return damage;
    }

    private boolean checkCrit() {
        int random = ((int) (Math.ceil(Math.random() * 100)));
        return random <= currentPokadet.getCritChance();
    }

    private int attackRandom() {
        return (int) (Math.ceil(Math.random() * 5));
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

            return false;
        }

        if (!pokadet2.isAlive()) {

            return false;
        }
        return true;
    }

    public void implementTrainersBoost(Trainer trainer) {
        BoostType boost = trainer.getBoost();
        int amount = trainer.getAmount();
        switch (boost) {
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

    public String getDoubleInfo() {
        if (currentPokadet.equals(pokadet1)) {
            return Messages.getStats(currentPokadet, pokadet2);
        }

        return Messages.getStats(currentPokadet, pokadet1);

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

