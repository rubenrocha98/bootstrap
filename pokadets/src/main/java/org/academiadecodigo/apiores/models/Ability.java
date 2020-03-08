package org.academiadecodigo.apiores.models;

import org.academiadecodigo.apiores.view.Messages;

public enum Ability {

    //Basic abilities
    KICK (Target.ENEMY, 8, "Kick "),
    SCRATCH (Target.ENEMY, 8, "Scratch "),
    HEADBUTT (Target.ENEMY, 8, "Headbutt "),
    UPPERCUT (Target.ENEMY, 8, "Uppercut "),

    //Attack abilities
    THROW_CHAIR (Target.ENEMY, 5, "Throw chair "),
    PRESS_NO(Target.ENEMY, 5, "Press NO button "),
    THROW_RAT (Target.ENEMY, 5,"Throw Rat "),
    CHANGE_BACKGROUND(Target.ENEMY, 5,"Change Background "),
    STEAL_PASSWORD(Target.ENEMY,5,"Steal Password "),
    TROLL_OPPONENT(Target.ENEMY,5,"Troll your opponent "),
    TROLL_MC(Target.ENEMY,5,"Troll enemy MC "),

    //Heal abilities
    LAUGH(Target.SELF, 6, "Laugh "),
    FALL_ASLEEP(Target.SELF,7,"Fall asleep during lecture "),
    CIGAR(Target.SELF,5,"Cigarette break "),
    COFFEE(Target.SELF, 5, "Coffee break "),
    BEER(Target.SELF,6, "Drink a cold one "),
    CABEÇOS(Target.SELF, 7, "Smoke a cabeço "),


    //Special abilities
    GUSTAVO_ABILITY (Target.ENEMY, 40, "THROW CHINELOS (base damage: 40)"),
    SARA_ABILITY (Target.SELF, 50, "PERFECT STORYTELLING (heal: 50)"),
    RUBEN_ABILITY (Target.ENEMY, 40, "INTENSIVE QUESTIONS (base damage: 40)"),
    FABIO_ABILITY (Target.SELF, 50, "BUY BEER (heal: 50)"),
    BRUNO_ABILITY (Target.ENEMY, 40, "SENHOR (base damage: 40)"),
    JAIME_ABILITY (Target.SELF, 50, "GO TO MODELO (heal: 50)"),
    ANDRE_ABILITY (Target.ENEMY, 40, "FEEDBACK MASTER (base damage: 40)"),
    DUTRA_ABILITY (Target.SELF, 50, "DELMAN DANCING MOVES (heal: 50)"),
    MIGUEL_ABILITY (Target.ENEMY, 40, "QUACK (damage: 40)"),
    HUGO_ABILITY (Target.ENEMY, 40, "SPREAD THE DISEASE (base damage: 40)"),
    JULIO_ABILITY (Target.ENEMY, 40, "INVOKE TURTLE ARMY (base damage: 40)"),
    FRANCISCO_ABILITY (Target.SELF, 50,  "GET INTO SLAV POSITION (heal: 50)"),
    EVANDRO_ABILITY (Target.SELF, 50, "ACTIVATE SHY MODE (heal: 50)"),
    BERNARDO_ABILITY (Target.ENEMY, 40, "CORONAVIRUS (base damage: 40)"),
    PAULO_ABILITY (Target.ENEMY, 40, "PIADA SECA (base damage: 40)"),
    XAVIER_ABILITY (Target.SELF ,50, "SLEEP IN PUFFS (heal: 50)"),
    CLAUDIA_ABILITY (Target.ENEMY, 40, "SOLTA A FRANGA (base damage: 40)"),
    PEDRO_ABILITY (Target.ENEMY, 40, "THROW HASHES (base damage: 40)");

    private Target target;
    private int amount;
    private String name;

    Ability (Target target, int amount, String name){
        this.target = target;
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getHeal(int amount) {
        return Messages.GREEN_BOLD_BRIGHT + "(heal: " + amount + ")" + Messages.ANSI_RESET;
    }

    public Target getTarget() {
        return target;
    }
}
