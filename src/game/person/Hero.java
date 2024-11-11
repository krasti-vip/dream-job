package game.person;

import game.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    /**
     * вместо паладина создан лучник и оружие лук(bow)
     */
    protected T weapon;

    private int hp;

    private int mana;

    private int power;

    private int intelligence;

    private int dexterity;

    public Hero(T weapon, int hp, int mana, int power, int intelligence, int dexterity) {
        this.weapon = weapon;
        this.hp = hp;
        this.mana = mana;
        this.power = power;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    /**
     * тут нахерачить характеристики ману жизнь урон атаку 
     */
    abstract public void attack();
}
