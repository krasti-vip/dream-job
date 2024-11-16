package game.monster.InferiorEnemies;

import game.monster.Monster;
import game.weapon.monstersWeapon.inferiorEnemies.Stick;

public class Goblin<T extends Stick> extends Monster<T> {

    public Goblin(T weapon) {
        super(weapon, 30, 5, 7, 5, 10);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
