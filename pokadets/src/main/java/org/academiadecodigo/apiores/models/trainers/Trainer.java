package org.academiadecodigo.apiores.models.trainers;

public enum Trainer {

    SORAIA(20, BoostType.HP),
    RICARDO(10, BoostType.DEFENSE),
    RITA(10, BoostType.ATTACK),
    JOJO(5, BoostType.CRITICAL);

    private int amount;
    private BoostType boost;

    Trainer(int amount, BoostType boost) {
        this.amount = amount;
        this.boost = boost;
    }

    public int getAmount() {
        return amount;
    }

    public BoostType getBoost() {
        return boost;
    }
}
