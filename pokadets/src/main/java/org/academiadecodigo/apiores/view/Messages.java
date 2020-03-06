package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.Pokadet;

import java.util.Map;

public class Messages {

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";

    public final static String INVALID_ABILITY = "";


    public static String[]abilitiesMenu(Pokadet pokadet){

        Map<Integer, Ability> abilities = pokadet.getAbilities();

        String[] abilitiesString = new String[abilities.size()];

        for (int i = 0; i<abilities.size(); i++){
            abilitiesString[i]=abilities.get(i).getName();
        }
        return abilitiesString;
    }

    public static String pokadetInfo(Pokadet pokadet){
        return "Hp: "+pokadet.getHp();
    }
}
