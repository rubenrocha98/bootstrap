package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.models.Ability;

import java.util.Map;

public interface Pokadet {

    Ability getAbility(int skill);

    boolean isAlive();

    void setAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4);

    Map<Integer, Ability> getAbilities();

    void setHp(int hp);

    String getName();

    int getHp();

    int getAttack();

    int getDefense();

    int getCritChance();

    void setAttack(int attack);

    void setDefense(int defense);

    void setCritChance(int critChance);

    void setStats(int hp, int attack, int defense, int critChance);

    void setMaxHP(int maxHP);
}
