package game.monster;

import game.weapon.Weapon;

public abstract class Monster<T extends Weapon> {

    protected T weapon;

    private int hp;

    private int mana;

    private int power;

    private int intelligence;

    private int dexterity;

    public Monster(T weapon, int hp, int mana, int power, int intelligence, int dexterity) {
        this.weapon = weapon;
        this.hp = hp;
        this.mana = mana;
        this.power = power;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    abstract public void attack();
}