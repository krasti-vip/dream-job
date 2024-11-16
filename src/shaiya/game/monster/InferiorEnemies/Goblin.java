package shaiya.game.monster.InferiorEnemies;

import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.Stick;

public class Goblin<T extends Stick> extends Monster<T> {

    public Goblin(T weapon) {
        super(weapon, 30, 5, 7, 5, 10);
    }
}
