package org.academiadecodigo.apiores.models;

import java.util.Map;

public abstract class AbstractPokadet implements Pokadet{

    protected Map<Integer,Ability> abilities;
    protected int hp;
    protected boolean alive;


    public AbstractPokadet() {

    }

    public Ability getAbility(int skill) {
        return null;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return alive;
    }


    public void setAbilities(Ability ability1,Ability ability2,Ability ability3,Ability ability4) {

    }
}
