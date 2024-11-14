package game.person;

import game.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    protected T weapon;

    private int hp;
    /**
     * мана не реализована, будем ее использовать позже, для способностей или для оружия
     */
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

    public int attackDamage() {
        // Проверка на промах на основе ловкости
        if (missedAttack()) {
            System.out.println("Промах!");

            return 0;
        }
        int baseAttack = (this instanceof Mage || this instanceof Necromancer) ? intelligence * 3 : power * 2;
        return baseAttack;
    }

    // Метод, который рассчитывает шанс промаха
    private boolean missedAttack() {
        double missChance = Math.max(0.1, 1.0 - dexterity / 100.0);

        return Math.random() < missChance;
    }

    abstract public void attack();
}
