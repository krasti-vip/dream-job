package game.person;

import game.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    /**
     * вместо паладина создан лучник и оружие лук(bow)
     */
    protected T weapon;

    public Hero(T weapon) {
        this.weapon = weapon;
    }

    abstract public void attack();
}
