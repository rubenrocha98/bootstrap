package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.models.Ability;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPokadet implements Pokadet {

    protected Map<Integer, Ability> abilities;
    protected int hp;
    protected String name;

    public boolean isAlive() {
        return hp>0;
    }

    public Ability getAbility(int skill) {
        return abilities.get(skill);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;

    }


    public void setAbilities(Ability ability1, Ability ability2, Ability ability3, Ability ability4) {

        abilities = new HashMap<>();

        abilities.put(1, ability1);
        abilities.put(2, ability2);
        abilities.put(3, ability3);
        abilities.put(4, ability4);
    }

    public Map<Integer, Ability> getAbilities() {
        return abilities;
    }

    @Override
    public String getName() {
        return name;
    }
}
