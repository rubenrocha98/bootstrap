package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.models.Ability;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPokadet implements Pokadet {

    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int critChance = 5;

    protected Map<Integer, Ability> abilities;

    public boolean isAlive() {
        return hp > 0;
    }

    public Ability getAbility(int skill) {
        return abilities.get(skill);

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

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getCritChance() {
        return critChance;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }
}
