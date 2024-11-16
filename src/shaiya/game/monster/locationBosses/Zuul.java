package shaiya.game.monster.locationBosses;

import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaff;

public class Zuul<T extends IceStaff> extends Monster<T> {

    public Zuul(T weapon) {
        super(weapon, 250, 50, 70, 55, 100);
    }
}
