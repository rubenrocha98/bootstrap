package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.models.trainers.Trainer;

import java.util.Map;

public class Messages {

    public final static String LINE = "wwww wwww wwww wwww wwww wwww wwww wwww wwww wwww wwww wwww wwww\n";
    public final static String[] OPEN_MENU = {"Start", "Quit"};
    public final static String ABILITY_USED_YOU= "\nUsed ability: ";
    public final static String ABILITY_USED_ENEMY="\nEnemy used ability: ";
    public final static String CHOOSE_TRAINER = "Choose your Pokadet Trainer!";
    public final static String CONTINUE = "\nContinue?";
    public final static String WAITING_PLAYER = "\nWaiting for an opponent to connect...";
    public final static String WAITING_OPONENT = "\nWaiting for opponent to pick";
    public final static String ABILITY_TO_USE = "\n\nWhat ability do you want to use?";
    public final static String SELECT_OPTION = "Select your option";
    public final static String QUIT = "Quiting Game...";
    public final static String[] SELECT_POKADET = {"Yes", "Return"};
    public final static String RESTART = "Restart?";
    public final static String[] RESTART_MENU = {"Yes", "No"};
    public final static String WELCOME = "\n\n                                  \n" +
            "██████╗  ██████╗ ██╗  ██╗ █████╗ ██████╗ ███████╗████████╗███████╗\n" +
            "██╔══██╗██╔═══██╗██║ ██╔╝██╔══██╗██╔══██╗██╔════╝╚══██╔══╝██╔════╝\n" +
            "██████╔╝██║   ██║█████╔╝ ███████║██║  ██║█████╗     ██║   ███████╗\n" +
            "██╔═══╝ ██║   ██║██╔═██╗ ██╔══██║██║  ██║██╔══╝     ██║   ╚════██║\n" +
            "██║     ╚██████╔╝██║  ██╗██║  ██║██████╔╝███████╗   ██║   ███████║\n" +
            "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝   ╚═╝   ╚══════╝\n";

    public final static String CHOOSE_PLAYER = LINE+"\nChoose your Pokadet!";

    public final static String LOOSER = ("\n" +
            "       ██╗      ██████╗ ███████╗████████╗      \n" +
            "       ██║     ██╔═══██╗██╔════╝╚══██╔══╝      \n" +
            "       ██║     ██║   ██║███████╗   ██║         \n" +
            "       ██║     ██║   ██║╚════██║   ██║         \n" +
            "       ███████╗╚██████╔╝███████║   ██║██╗██╗██╗\n" +
            " You   ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝╚═╝╚═╝╚═╝   restart?\n" +
            "                                        ");

    private static String winnerAscci = "";

    public final static String WINNER = winnerAscci + ("\n" +
            "       ██╗    ██╗ ██████╗ ███╗   ██╗██╗\n" +
            "       ██║    ██║██╔═══██╗████╗  ██║██║\n" +
            "       ██║ █╗ ██║██║   ██║██╔██╗ ██║██║\n" +
            "       ██║███╗██║██║   ██║██║╚██╗██║╚═╝\n" +
            "       ╚███╔███╔╝╚██████╔╝██║ ╚████║██╗\n" +
            "        ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝ \n" +
            "                                ");

    private static String player1Ascci = "";

    private static String player2Ascci = "";

    public final static String ASCCI_VS_ASCCI = player1Ascci + "   " +
            ":::     :::  ::::::::      \n" +
            ":+:     :+: :+:    :+:     \n" +
            "+:+     +:+ +:+            \n" +
            "+#+     +:+ +#++:++#++     \n" +
            " +#+   +#+         +#+     \n" +
            "  #+#+#+#   #+#    #+# #+# \n" +
            "    ###      ########  ### " + player2Ascci;

    //ascii generator: https://manytools.org/hacker-tools/ascii-banner/
    //style: banner, font: ANSI Shadow

    public static String[] abilitiesMenu(Pokadet pokadet) {


        Map<Integer, Ability> abilities = pokadet.getAbilities();

        String[] abilitiesString = new String[abilities.size()];

        for (int i = 0; i < abilities.size(); i++) {
            abilitiesString[i] = abilities.get(i + 1).getName();
        }
        return abilitiesString;
    }


    public static String[] pokadetMenu(Map<Integer, Pokadet> map) {

        String[] pokadetsString = new String[map.size()];

        for (int i = 0; i < map.keySet().size(); i++) {
            pokadetsString[i] = map.get(i + 1).getName();
        }

        return pokadetsString;
    }


    public static void setWinnerAscci(String winnerAscci) {
        Messages.winnerAscci = winnerAscci;
    }

    public static void setPlayer1Ascci(String player1Ascci) {
        Messages.player1Ascci = player1Ascci;
    }

    public static void setPlayer2Ascci(String player2Ascci) {
        Messages.player2Ascci = player2Ascci;
    }

    public static String getStats(Pokadet currentPokadet) {
        String skills = "";
        for (String s : abilitiesMenu(currentPokadet)) {
            skills += s + " | ";
        }

        return "Current Pokadet: " + currentPokadet.getName() + "\n\n" +
                "Player Abilities: " + skills + "\n\n" +
                "Defense: " + currentPokadet.getDefense() + "\n" +
                "Attack: " + currentPokadet.getAttack() + "\n" +
                "Critical strike chance: " + currentPokadet.getCritChance() + "\n"+
                "HP: " + currentPokadet.getHp() + "\n";
    }

    public static String getStats(Pokadet currentPokadet, Pokadet targetPokadet) {

        return "\nEnemy Pokadet: "+targetPokadet.getName()+ "\n\nYour Pokadet: " + currentPokadet.getName() +
                "\n\nDefense: " + currentPokadet.getDefense() + "\n" +
                "Attack: " + currentPokadet.getAttack() + "\n" +
                "Critical strike chance: " + currentPokadet.getCritChance() + "\n"+
                "Your HP: " + currentPokadet.getHp() + "    #####    Enemy HP: " + targetPokadet.getHp();
    }


    public static String[] getTrainerInfo(){
        Trainer[] trainers = Trainer.values();
        String [] trainersName = new String[Trainer.values().length];
        for (int i = 0; i < Trainer.values().length; i++) {
            trainersName[i] = trainers[i].getName();
        }
        return trainersName;
    }
}