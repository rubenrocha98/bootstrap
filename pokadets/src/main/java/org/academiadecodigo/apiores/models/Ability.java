package org.academiadecodigo.apiores.models;

public enum Ability {

    //basic abilities
    KICK (Target.ENEMY, 8, "Kick (damage: 8)"),
    SCRATCH (Target.ENEMY, 7, "Scratch (damage: 7)"),
    HEADBUTT (Target.ENEMY, 11, "Headbutt (damage: 11)"),
    THROW_CHAIR (Target.ENEMY, 11, "Throw chair (damage: 11)"),
    UPPERCUT (Target.ENEMY, 9, "Uppercut (damage: 9)"),
    HEAL (Target.SELF, 6, "Heal (heal: 6)"),
    THROW_RAT (Target.ENEMY, 11,"Throw Rat (damage: 11)"),
    CHANGE_BACKGROUND(Target.ENEMY, 7,"Change Background (damage: 7)"),
    STEAL_PASSWORD(Target.ENEMY,10,"Steal Password (damage: 10)"),
    FALL_ASLEEP(Target.SELF,7,"Fall asleep during lecture (heal: 7)"),
    CIGAR(Target.SELF,5,"Cigarette break (heal: 5)"),
    COFFEE(Target.SELF, 5, "Coffee break (heal: 5)"),
    BEER(Target.SELF,6, "Drink a cold one (heal: 6)"),
    TROLL_OPPONENT(Target.ENEMY,8,"Troll your opponent (damage: 8)"),
    TROLL_MC(Target.ENEMY,5,"Troll enemy trainer (damage: 5)"),




    //Special abilities
    GUSTAVO_ABILITY (Target.ENEMY, 40, "THROW CHINELOS"),
    SARA_ABILITY (Target.ENEMY, 40, "THROW SQUARE ROOT"),
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
