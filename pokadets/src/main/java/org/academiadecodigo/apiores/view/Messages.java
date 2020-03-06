package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;

import java.security.PublicKey;
import java.util.Map;

public class Messages {

    private static String winnerAscci;

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";

    public final static String INVALID_ABILITY = "";

    public final static String  WELCOME ="\n\n                                  WELCOME\n" +
            "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗\n" +
            "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝\n" +
            "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗  \n" +
            "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝  \n" +
            "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗\n" +
            " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝\n\n" +
            "Select your player:\n";

    public final static String ABILITY_SELECTION = " select your move:"; // Vai ter nome do Pokadet antes desta String

    public final static String WINNER = " you                       ### \n" +
            " #    #  ####  #    # ### \n" +
            " #    # #    # ##   # ### \n" +
            " #    # #    # # #  #  #  \n" +
            " # ## # #    # #  # #     \n" +
            " ##  ## #    # #   ## ### \n" +
            " #    #  ####  #    # ### \n" +
            "\n Restart?";

    
    public final static String WINNER2 = winnerAscci + ("\n" +
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

    public String[] pokadetMenu (Map<Integer,Pokadet> map){

        String[] pokadetsString = new String[map.size()];

        for (int i = 0; i < map.keySet().size(); i++) {
            pokadetsString[i] = map.get(i+1).getName();
        }

        return pokadetsString;
    }

    public static String[] restartMenu(){

        return new String[]{"Yes", "No"};
    }

    public static void setWinnerAscci(String string){
        winnerAscci = string;
    }


}
