package game.monster.InferiorEnemies;

import game.monster.Monster;
import game.weapon.monsters.inferiorEnemies.Stick;

public class Damn<T extends Stick> extends Monster<T> {

    public Damn(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
