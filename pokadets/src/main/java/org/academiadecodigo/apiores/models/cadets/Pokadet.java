package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.models.Ability;

public interface Pokadet {

    Ability getAbility(int skill);

    boolean isAlive();

    void setHp(int hp);

    int getHp();
}
