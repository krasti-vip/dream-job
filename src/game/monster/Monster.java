package game.monster;

import game.monster.darkElves.QueenOfAzshara;
import game.monster.locationBosses.Zuul;
import game.person.Mage;
import game.person.Necromancer;
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

    public int attackDamage() {

        if (missedAttack()) {
            System.out.println("Промах!");

            return 0;
        }
        int baseAttack = (this instanceof QueenOfAzshara || this instanceof Zuul) ? intelligence * 3 : power * 2;
        return baseAttack;
    }

    private boolean missedAttack() {
        double missChance = Math.max(0.1, 1.0 - dexterity / 100.0);

        return Math.random() < missChance;
    }

    abstract public void attack();
}