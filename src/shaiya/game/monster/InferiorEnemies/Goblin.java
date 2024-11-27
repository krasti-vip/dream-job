package shaiya.game.monster.InferiorEnemies;

import shaiya.game.inventory.DexterityPotion;
import shaiya.game.inventory.JarOfSap;
import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.Stick;

public class Goblin<T extends Stick> extends Monster<T> {

    public Goblin(T weapon) {
        super(weapon, 30, 5, 7, 5, 10);

        DexterityPotion dexterityPotion = new DexterityPotion();

        dexterityPotion.setCount(1);
        addLut(dexterityPotion);
    }

    @Override
    public String toString() {
        return "Гоблин с палкой";
    }
}
