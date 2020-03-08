package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.models.trainers.Trainer;

import java.util.Map;

public class Messages {

    //Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";
    //

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
    //

    public static final String WHITE_BACKGROUND = "\033[1;96m"; // PURPLE


    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";
    //

    public final static String LINE2 = WHITE_BOLD + "\noooooooooooooooooooooooooooooooooooooo\n\n" + ANSI_RESET;
    public final static String CURRENTLINE = LINE2;

    public final static String[] OPEN_MENU = {GREEN_BOLD_BRIGHT + "Start" + ANSI_RESET, RED_BOLD_BRIGHT + "Quit" + ANSI_RESET};
    public final static String ABILITY_USED_YOU = CURRENTLINE + "Used ability: ";
    public final static String ABILITY_USED_ENEMY = "\nEnemy used ability: ";
    public final static String CHOOSE_TRAINER = CURRENTLINE + "Choose your Pokadet Trainer!";
    public final static String CONTINUE = "\nContinue?";
    public final static String WAITING_PLAYER = "\nWaiting for an opponent to connect...";
    public final static String CHOOSE_PLAYER = CURRENTLINE + WHITE_UNDERLINED + WHITE_BOLD_BRIGHT + "Choose your Pokadet!" + ANSI_RESET;
    public final static String POKADET_PICKED = CURRENTLINE + "\nPokadet already picked";
    public final static String WAITING_OPONENT = "\nWaiting for opponent to pick...";

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";
    public final static String SELECT_OPTION = "Select your option:";
    public final static String QUIT = "Quiting Game...";
    public final static String[] SELECT_POKADET = {GREEN_BOLD_BRIGHT + "Yes" + ANSI_RESET, RED_BOLD_BRIGHT + "Return" + ANSI_RESET};
    public final static String RESTART = "Restart?";
    public final static String[] RESTART_MENU = {GREEN_BOLD_BRIGHT + "Yes" + ANSI_RESET, RED_BOLD_BRIGHT + "No" + ANSI_RESET};


    public final static String WELCOME = WHITE_BOLD_BRIGHT + "\n\n                                 \n" +
            WHITE_BACKGROUND + "                                                                  " + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "██████╗  ██████╗ ██╗  ██╗ █████╗ ██████╗ ███████╗████████╗███████╗" + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "██╔══██╗██╔═══██╗██║ ██╔╝██╔══██╗██╔══██╗██╔════╝╚══██╔══╝██╔════╝" + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "██████╔╝██║   ██║█████╔╝ ███████║██║  ██║█████╗     ██║   ███████╗" + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "██╔═══╝ ██║   ██║██╔═██╗ ██╔══██║██║  ██║██╔══╝     ██║   ╚════██║" + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "██║     ╚██████╔╝██║  ██╗██║  ██║██████╔╝███████╗   ██║   ███████║" + ANSI_RESET + "\n" +
            WHITE_BOLD_BRIGHT + WHITE_BACKGROUND + "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝   ╚═╝   ╚══════╝" + ANSI_RESET + "\n";


    public final static String LOOSER = ("\n\n" +
            ANSI_RED + "██╗   ██╗ ██████╗ ██╗   ██╗    ██╗      ██████╗ ███████╗████████╗      \n" +
            "╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║     ██╔═══██╗██╔════╝╚══██╔══╝      \n" +
            " ╚████╔╝ ██║   ██║██║   ██║    ██║     ██║   ██║███████╗   ██║         \n" +
            "  ╚██╔╝  ██║   ██║██║   ██║    ██║     ██║   ██║╚════██║   ██║         \n" +
            "   ██║   ╚██████╔╝╚██████╔╝    ███████╗╚██████╔╝███████║   ██║██╗██╗██╗\n" +
            "   ╚═╝    ╚═════╝  ╚═════╝     ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝╚═╝╚═╝╚═╝\n" + ANSI_RESET);

    private static String winnerAscci = "";

    public final static String WINNER = winnerAscci + ("\n" +
            GREEN_BOLD_BRIGHT + "██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗ ██████╗ ███╗   ██╗██╗\n" +
            "╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██╔═══██╗████╗  ██║██║\n" +
            " ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║   ██║██╔██╗ ██║██║\n" +
            "  ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║   ██║██║╚██╗██║╚═╝\n" +
            "   ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝╚██████╔╝██║ ╚████║██╗\n" +
            "   ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝\n" +
            "                                                               " + ANSI_RESET);

    public static String[] abilitiesMenu(Pokadet pokadet) {


        Map<Integer, Ability> abilities = pokadet.getAbilities();

        String[] abilitiesString = new String[abilities.size()];

        for (int i = 0; i < abilities.size(); i++) {
            if (i == 3) {
                abilitiesString[i] = PURPLE_BOLD + abilities.get(i + 1).getName() + " (Special Ability" + ANSI_RESET + " can only be used once!)";
                continue;
            }
            if (i == 1) {
                abilitiesString[i] = abilities.get(i + 1).getName() + getBaseDamage();
                continue;
            }
            if (i == 0) {
                abilitiesString[i] = abilities.get(i + 1).getName() + getFirstAtackDmg();
                continue;
            }

            abilitiesString[i] = abilities.get(i + 1).getName() + abilities.get(i + 1).getHeal(abilities.get(i + 1).getAmount());
        }
        return abilitiesString;
    }

    private static String getBaseDamage() {
        return Messages.ANSI_RED + "(base damage: 6 - 10)" + Messages.ANSI_RESET;
    }

    private static String getFirstAtackDmg() {
        return Messages.ANSI_RED + "(base damage: 8)" + Messages.ANSI_RESET;
    }


    public static String[] pokadetMenu(Map<Integer, Pokadet> map) {

        String[] pokadetsString = new String[map.size()];

        for (int i = 0; i < map.keySet().size(); i++) {
            pokadetsString[i] = map.get(i + 1).getName() + "\n";
        }

        return pokadetsString;
    }

    public static String getStats(Pokadet currentPokadet) {
        String skills = "";
        for (String s : abilitiesMenu(currentPokadet)) {
            skills += s + " | ";
        }

        return Messages.CURRENTLINE + "Current Pokadet: " + currentPokadet.getName() + "\n\n" +
                "Player Abilities: " + skills + "\n" + Messages.CURRENTLINE +
                GREEN_BOLD_BRIGHT + "HP: " + currentPokadet.getHp() + ANSI_RESET +
                ANSI_RED + "\nAttack: " + currentPokadet.getAttack() + "\n" + ANSI_RESET +
                CYAN_BOLD_BRIGHT + "Defense: " + currentPokadet.getDefense() + "\n" + ANSI_RESET +
                YELLOW_BOLD_BRIGHT + "Critical strike chance: " + currentPokadet.getCritChance() + ANSI_RESET + "\n";
    }

    public static String getStats(Pokadet currentPokadet, Pokadet targetPokadet) {

        return CURRENTLINE + GREEN_BOLD_BRIGHT + "Your Pokadet: " + ANSI_RESET + currentPokadet.getName() +
                RED_BOLD_BRIGHT + "\nEnemy Pokadet: " + ANSI_RESET + targetPokadet.getName() +
                GREEN_BOLD_BRIGHT + "\n\nYour HP: " + currentPokadet.getHp() + ANSI_RESET + "    #####    " +
                RED_BOLD_BRIGHT + "Enemy HP: " + targetPokadet.getHp() + "\n" + ANSI_RESET;
    }


    public static String[] getTrainerInfo() {
        Trainer[] trainers = Trainer.values();
        String[] trainersName = new String[Trainer.values().length];
        for (int i = 0; i < Trainer.values().length; i++) {
            trainersName[i] = trainers[i].getName();
        }
        return trainersName;
    }
}