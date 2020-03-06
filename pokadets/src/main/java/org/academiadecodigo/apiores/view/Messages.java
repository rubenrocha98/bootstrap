package org.academiadecodigo.apiores.view;

import org.academiadecodigo.apiores.models.cadets.Pokadet;

public class Messages {

    public final static String ABILITY_TO_USE = "\nWhat ability do you want to use?";

    public final static String INVALID_ABILITY = "";


    public static String[]abilitiesMenu(Pokadet pokadet){
        return null;
    }

    public static String pokadetInfo(Pokadet pokadet){
        return "Hp: "+pokadet.getHp();
    }
}
