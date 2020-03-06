package org.academiadecodigo.apiores.models;

public enum Ability {

    KICK (Target.ENEMY, 10, "Kick"),
    SCRATCH (Target.ENEMY, 10, "Scratch"),
    HEADBUTT (Target.ENEMY, 10, "Headbutt"),
    THROW_CHAIR (Target.ENEMY, 10, "Throw chair"),
    UPPERCUT (Target.ENEMY, 10, "Uppercut"),
    HEAL (Target.SELF, 15, "Heal"),

    //Special abilities
    GUSTAVO_ABILITY (Target.ENEMY, 40, "THROW CHINELOS"),
    SARA_ABILITY (Target.ENEMY, 40, "THROW SQUARE ROOT"),
    RUBEN_ABILITY (Target.ENEMY, 40, "-----"),
    FABIO_ABILITY (Target.ENEMY, 40, "-----"),
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
