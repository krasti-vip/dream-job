package shaiya.game.monster;

import lombok.Data;
import shaiya.game.monster.darkElves.QueenOfAzshara;
import shaiya.game.monster.locationBosses.Zuul;
import shaiya.game.person.Hero;
import shaiya.game.weapon.Weapon;

@Data
public abstract class Monster<T extends Weapon> {

    protected T weapon;

    private int hp;

    private int mana;

    private int power;

    private int intelligence;

    private int dexterity;

    private boolean alive = true;

    public Monster(T weapon, int hp, int mana, int power, int intelligence, int dexterity) {
        this.weapon = weapon;
        this.hp = hp;
        this.mana = mana;
        this.power = power;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
    }

    public void attackDamage(Hero<?> hero) {

        if (missedAttack()) {
            System.out.println("Монстр промахивается!");
            return;
        }

        hero.takingDamage(damageCalculation());
    }

    private int damageCalculation() {
        int damageMultiplier = (this instanceof QueenOfAzshara || this instanceof Zuul) ? intelligence * 3 : power * 2;
        return damageMultiplier + weapon.getDamage();
    }

    private boolean missedAttack() {
        double missChance = Math.max(0.1, 1.0 - dexterity / 100.0);

        return Math.random() < missChance;
    }

    public void takingDamage(int damage) {
        hp -= damage;

        if (hp < 1) {
            alive = false;
        }
    }
}