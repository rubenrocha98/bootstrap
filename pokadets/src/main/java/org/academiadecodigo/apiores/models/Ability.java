package org.academiadecodigo.apiores.models;

public enum Ability {

    //Basic abilities
    KICK (Target.ENEMY, 8, "Kick (damage: 8)"),
    SCRATCH (Target.ENEMY, 8, "Scratch (damage: 8)"),
    HEADBUTT (Target.ENEMY, 8, "Headbutt (damage: 8)"),
    UPPERCUT (Target.ENEMY, 8, "Uppercut (damage: 8)"),

    //Attack abilities
    THROW_CHAIR (Target.ENEMY, 5, "Throw chair (damage: 6 - 10)"),
    PRESS_NO(Target.ENEMY, 5, "Press NO button (damage: 6 - 10)"),
    THROW_RAT (Target.ENEMY, 5,"Throw Rat (damage: 6 - 10)"),
    CHANGE_BACKGROUND(Target.ENEMY, 5,"Change Background (damage: 6 - 10)"),
    STEAL_PASSWORD(Target.ENEMY,5,"Steal Password (damage: 6 - 10)"),
    TROLL_OPPONENT(Target.ENEMY,5,"Troll your opponent (damage: 6 - 10)"),
    TROLL_MC(Target.ENEMY,5,"Troll enemy MC (damage: 6 - 10)"),

    //Heal abilities
    LAUGH(Target.SELF, 6, "Laugh (heal: 6)"),
    FALL_ASLEEP(Target.SELF,7,"Fall asleep during lecture (heal: 7)"),
    CIGAR(Target.SELF,5,"Cigarette break (heal: 5)"),
    COFFEE(Target.SELF, 5, "Coffee break (heal: 5)"),
    BEER(Target.SELF,6, "Drink a cold one (heal: 6)"),
    CABEÇOS(Target.SELF, 7, "Smoke a cabeço (heal: 7)"),


    //Special abilities
    GUSTAVO_ABILITY (Target.ENEMY, 40, "THROW CHINELOS (damage: 40)"),
    SARA_ABILITY (Target.SELF, 50, "PERFECT STORYTELLING (heal: 50)"),
    RUBEN_ABILITY (Target.ENEMY, 40, "INTENSIVE QUESTIONS (damage: 40)"),
    FABIO_ABILITY (Target.SELF, 50, "BUY BEER (heal: 50)"),
    BRUNO_ABILITY (Target.ENEMY, 40, "SENHOR (damage: 40)"),
    JAIME_ABILITY (Target.SELF, 50, "GO TO MODELO (heal: 50)"),
    ANDRE_ABILITY (Target.ENEMY, 40, "FEEDBACK MASTER (damage: 40)"),
    DUTRA_ABILITY (Target.SELF, 50, "DELMAN DANCING MOVES (heal: 50)"),
    MIGUEL_ABILITY (Target.ENEMY, 40, "QUACK (damage: 40)"),
    HUGO_ABILITY (Target.ENEMY, 40, "SPREAD THE DISEASE (damage: 40)"),
    JULIO_ABILITY (Target.ENEMY, 40, "INVOKE TURTLE ARMY (damage: 40)"),
    FRANCISCO_ABILITY (Target.SELF, 50,  "GET INTO SLAV POSITION (heal: 50)"),
    EVANDRO_ABILITY (Target.SELF, 50, "ACTIVATE SHY MODE (heal: 50)"),
    BERNARDO_ABILITY (Target.ENEMY, 40, "CORONAVIRUS (damage: 40)"),
    PAULO_ABILITY (Target.ENEMY, 40, "PIADA SECA (damage: 40)"),
    XAVIER_ABILITY (Target.SELF ,50, "SLEEP IN PUFFS (heal: 50)"),
    CLAUDIA_ABILITY (Target.ENEMY, 40, "SOLTA A FRANGA (damage: 40)"),
    PEDRO_ABILITY (Target.ENEMY, 40, "THROW HASHES (damage: 40)");

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

    public Target getTarget() {
        return target;
    }
}
