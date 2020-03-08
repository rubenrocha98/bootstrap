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
    GUSTAVO_ABILITY (Target.ENEMY, 40, "THROW CHINELOS"),
    SARA_ABILITY (Target.SELF, 50, "PERFECT STORYTELLING"),
    RUBEN_ABILITY (Target.ENEMY, 40, "INTENSIVE QUESTIONS"),
    FABIO_ABILITY (Target.SELF, 50, "BUY BEER"),
    BRUNO_ABILITY (Target.ENEMY, 40, "SENHOR"),
    JAIME_ABILITY (Target.SELF, 50, "GO TO MODELO"),
    ANDRE_ABILITY (Target.ENEMY, 40, "FEEDBACK MASTER"),
    DUTRA_ABILITY (Target.SELF, 50, "DELMAN DANCING MOVES"),
    MIGUEL_ABILITY (Target.ENEMY, 40, "QUACK"),
    HUGO_ABILITY (Target.ENEMY, 40, "SPREAD THE DISEASE"),
    JULIO_ABILITY (Target.ENEMY, 40, "INVOKE TURTLE ARMY"),
    FRANCISCO_ABILITY (Target.SELF, 50,  "GET INTO SLAV POSITION"),
    EVANDRO_ABILITY (Target.SELF, 50, "ACTIVATE SHY MODE"),
    BERNARDO_ABILITY (Target.ENEMY, 40, "CORONAVIRUS"),
    PAULO_ABILITY (Target.ENEMY, 40, "PIADA SECA"),
    XAVIER_ABILITY (Target.SELF ,50, "SLEEP IN PUFFS"),
    CLAUDIA_ABILITY (Target.ENEMY, 40, "SOLTA A FRANGA"),
    PEDRO_ABILITY (Target.ENEMY, 40, "THROW HASHES");

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
