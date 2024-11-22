package shaiya.game.person;

import lombok.Data;
import shaiya.game.monster.Monster;
import shaiya.game.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

@Data
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

    private boolean alive = true;

    private List<Integer> loot = new ArrayList<>();

    public Hero(T weapon, int hp, int mana, int power, int intelligence, int dexterity) {
        this.weapon = weapon;
        this.hp = hp;
        this.mana = mana;
        this.power = power;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    public void addLoot(int item) {
        loot.add(item);
    }

    public void attack(Monster<?> monster) {

        if (missedAttack()) {
            System.out.println("Твой удар в молоко!");

            return;
        }

        monster.takingDamage(damageCalculation());

        if (monster.isAlive()) {
            System.out.println("Монстр не побежден!");
        } else {
            System.out.println("Монстр побежден!");
        }
    }

    private int damageCalculation() {
        int damageMultiplier = (this instanceof Mage || this instanceof Necromancer) ? intelligence * 3 : power * 2;
        return damageMultiplier + weapon.getDamage();
    }

    public void takingDamage(int damage) {
        hp -= damage;

        if (hp < 1) {
            alive = false;
        }
    }

    // Метод, который рассчитывает шанс промаха
    private boolean missedAttack() {
        double missChance = Math.max(0.1, 1.0 - dexterity / 100.0);

        return Math.random() < missChance;
    }
}
