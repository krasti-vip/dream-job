package game.monster.InferiorEnemies;

import game.monster.Monster;
import game.weapon.monsters.inferiorEnemies.Stick;

public class Goblin<T extends Stick> extends Monster<T> {

    public Goblin(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
