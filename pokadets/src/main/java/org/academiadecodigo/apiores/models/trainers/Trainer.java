package org.academiadecodigo.apiores.models.trainers;

import org.academiadecodigo.apiores.view.Messages;

public enum Trainer {

    SORAIA(20, BoostType.HP,Messages.WHITE_BOLD_BRIGHT + "Soraia" + Messages.ANSI_RESET + ", the APIores momma! Gives your Pokadet a " + Messages.GREEN_BOLD_BRIGHT + "+20HP!" + Messages.ANSI_RESET),
    RICARDO(5, BoostType.DEFENSE,Messages.WHITE_BOLD_BRIGHT + "Ricardo" + Messages.ANSI_RESET + ", the Design master! Gives your Pokadet " + Messages.CYAN_BOLD_BRIGHT + "+5 defense!" + Messages.ANSI_RESET),
    RITA(7, BoostType.ATTACK,Messages.WHITE_BOLD_BRIGHT + "Rita" + Messages.ANSI_RESET + ", the Psychic master! Gives your Pokadet " + Messages.ANSI_RED + "+7 attack!" + Messages.ANSI_RESET),
    JOJO(5, BoostType.CRITICAL,Messages.WHITE_BOLD_BRIGHT + "Jojo" + Messages.ANSI_RESET + ", the Scooter master! Gives your Pokadet " + Messages.YELLOW_BOLD_BRIGHT + "5% more chance to crit!" + Messages.ANSI_RESET);

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
