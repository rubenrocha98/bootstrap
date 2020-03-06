package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;

import java.util.Map;

public class Messages {

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";

    public final static String INVALID_ABILITY = "";

    public final static String  WELCOME_MESSAGE ="\n\n                                  WELCOME\n" +
            "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗\n" +
            "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝\n" +
            "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗  \n" +
            "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝  \n" +
            "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗\n" +
            " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝\n\n" +
            "Select your player:\n";


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
}
