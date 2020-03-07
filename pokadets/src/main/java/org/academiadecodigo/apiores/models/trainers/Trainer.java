package org.academiadecodigo.apiores.models.trainers;

public enum Trainer {

    SORAIA(20, BoostType.HP,"Soraia, gives you a 20HP boost."),
    RICARDO(10, BoostType.DEFENSE,"Ricardo, increases defense by 10."),
    RITA(10, BoostType.ATTACK,"Rita, increases atack by 10."),
    JOJO(5, BoostType.CRITICAL,"Jojo, increases critical strike chance by 5%");

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
