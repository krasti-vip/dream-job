package shaiya.game.monster.locationBosses;

import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaff;

public class IceGolem<T extends IceStaff> extends Monster<T> {

    public IceGolem(T weapon) {
        super(weapon, 250, 50, 70, 55, 100);
    }
}
