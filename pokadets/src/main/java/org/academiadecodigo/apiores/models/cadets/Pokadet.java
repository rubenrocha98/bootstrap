package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.models.Ability;

import java.util.Map;

public interface Pokadet {

    Ability getAbility(int skill);

    boolean isAlive();

    void setHp(int hp);

    int getHp();

    String getName();

    void setAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4);

    Map<Integer, Ability> getAbilities();

}
