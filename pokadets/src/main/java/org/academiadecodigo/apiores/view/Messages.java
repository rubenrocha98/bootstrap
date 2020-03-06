package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;

import java.security.PublicKey;
import java.util.Map;

public class Messages {

    private static String winnerAscci="";
    private static String player1Ascci="";
    private static String player2Ascci="";



    public final static String WAITING_PLAYER = "\nWaiting for player 2...";

    public final static String WAITING_OPONENT = "Waiting for oponent";

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";

    public final static String QUIT = "Quiting Game...";

    public final static String INVALID_ABILITY = "";

    public final static String  WELCOME ="\n\n                                  \n" +
            "██████╗  ██████╗ ██╗  ██╗ █████╗ ██████╗ ███████╗████████╗███████╗\n" +
            "██╔══██╗██╔═══██╗██║ ██╔╝██╔══██╗██╔══██╗██╔════╝╚══██╔══╝██╔════╝\n" +
            "██████╔╝██║   ██║█████╔╝ ███████║██║  ██║█████╗     ██║   ███████╗\n" +
            "██╔═══╝ ██║   ██║██╔═██╗ ██╔══██║██║  ██║██╔══╝     ██║   ╚════██║\n" +
            "██║     ╚██████╔╝██║  ██╗██║  ██║██████╔╝███████╗   ██║   ███████║\n" +
            "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝   ╚═╝   ╚══════╝\n" ;

    public final static String CHOOSE_PLAYER = "Choose your Pokadet!";

    public final static String ASCCI_VS_ASCCI = player1Ascci + "   " +
            ":::     :::  ::::::::      \n" +
            ":+:     :+: :+:    :+:     \n" +
            "+:+     +:+ +:+            \n" +
            "+#+     +:+ +#++:++#++     \n" +
            " +#+   +#+         +#+     \n" +
            "  #+#+#+#   #+#    #+# #+# \n" +
            "    ###      ########  ### " + player2Ascci;
;
    public final static String WINNER = winnerAscci + ("\n" +
            "       ██╗    ██╗ ██████╗ ███╗   ██╗██╗\n" +
            "       ██║    ██║██╔═══██╗████╗  ██║██║\n" +
            "       ██║ █╗ ██║██║   ██║██╔██╗ ██║██║\n" +
            "       ██║███╗██║██║   ██║██║╚██╗██║╚═╝\n" +
            "       ╚███╔███╔╝╚██████╔╝██║ ╚████║██╗\n" +
            "  You  ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝    Restart?\n" +
            "                                ");
    
    public final static String LOOSER = ("\n" +
            "       ██╗      ██████╗ ███████╗████████╗      \n" +
            "       ██║     ██╔═══██╗██╔════╝╚══██╔══╝      \n" +
            "       ██║     ██║   ██║███████╗   ██║         \n" +
            "       ██║     ██║   ██║╚════██║   ██║         \n" +
            "       ███████╗╚██████╔╝███████║   ██║██╗██╗██╗\n" +
            " You   ╚══════╝ ╚═════╝ ╚══════╝   ╚═╝╚═╝╚═╝╚═╝   Restart?\n" +
            "                                        ");

    //ascii generator: https://manytools.org/hacker-tools/ascii-banner/
    //style: banner, font: ANSI Shadow

    public static String[] open_menu(){
        return new String[]{"start", "quit"};
    }
    public static String[]abilitiesMenu(Pokadet pokadet){

        Map<Integer, Ability> abilities = pokadet.getAbilities();

        String[] abilitiesString = new String[abilities.size()];

        for (int i = 0; i<abilities.size(); i++){
            abilitiesString[i]=abilities.get(i+1).getName();
        }
        return abilitiesString;
    }

    public static String pokadetInfo(Pokadet pokadet){
        return "Hp: "+pokadet.getHp();
    }

    public static String[] pokadetMenu (Map<Integer,Pokadet> map){

        String[] pokadetsString = new String[map.size()];

        for (int i = 0; i < map.keySet().size(); i++) {
            pokadetsString[i] = map.get(i+1).getName();
        }

        return pokadetsString;
    }

    public static String[] restartMenu(){

        return new String[]{"Yes", "No"};
    }

    public static void setWinnerAscci(String winnerAscci){
        Messages.winnerAscci = winnerAscci;
    }

    public static void setPlayer1Ascci(String player1Ascci) {
        Messages.player1Ascci = player1Ascci;
    }

    public static void setPlayer2Ascci(String player2Ascci) {
        Messages.player2Ascci = player2Ascci;
    }
}
