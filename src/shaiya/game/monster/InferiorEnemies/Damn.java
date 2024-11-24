package shaiya.game.monster.InferiorEnemies;

import shaiya.game.inventory.JarOfSap;
import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.Stick;

public class Damn<T extends Stick> extends Monster<T> {

    public Damn(T weapon) {
        super(weapon, 30, 5, 7, 5, 10);

        JarOfSap jarOfSap = new JarOfSap();

        jarOfSap.setCount(99);
        addLut(jarOfSap);
    }

    @Override
    public String toString() {
        return "Черт с палкой";
    }
}
