package game.monster.InferiorEnemies;

import game.monster.Monster;
import game.weapon.monsters.inferiorEnemies.Stick;

public class Damn<T extends Stick> extends Monster<T> {

    public Damn(T weapon) {
        super(weapon, 30, 5, 7, 5, 10);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
