package org.academiadecodigo.apiores.models.trainers;

public enum Trainer {

    SORAIA(20, BoostType.HP,"Soraia, the APIores momma! Gives your pokadet a 20HP boost."),
    RICARDO(5, BoostType.DEFENSE,"Ricardo, the Design master! Increases your pokadet defense by 5."),
    RITA(7, BoostType.ATTACK,"Rita, the Psychic master! Increases your pokadet attack by 7."),
    JOJO(5, BoostType.CRITICAL,"Jojo, the Scooter master! Increases your pokadet critical strike chance by 5%.");

    private int amount;
    private BoostType boost;
    private String name;

    Trainer(int amount, BoostType boost, String name) {
        this.amount = amount;
        this.boost = boost;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public BoostType getBoost() {
        return boost;
    }

    public String getName() {
        return name;
    }
}
