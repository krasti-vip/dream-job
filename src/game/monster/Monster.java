package game.monster;

import game.weapon.Weapon;

public abstract class Monster<T extends Weapon> {

    protected T weapon;

    public Monster(T weapon) {
        this.weapon = weapon;
    }

    abstract public void attack();
}