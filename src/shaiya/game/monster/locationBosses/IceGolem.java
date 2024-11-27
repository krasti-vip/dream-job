package shaiya.game.monster.locationBosses;

import shaiya.game.inventory.PowerJar;
import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaff;

public class IceGolem<T extends IceStaff> extends Monster<T> {

    public IceGolem(T weapon) {
        super(weapon, 250, 50, 15, 5, 40);

        PowerJar powerJar = new PowerJar();

        powerJar.setCount(1);
        addLut(powerJar);
    }

    @Override
    public String toString() {
        return "Ледяной голем вооруженный ледяным посохом";
    }
}
