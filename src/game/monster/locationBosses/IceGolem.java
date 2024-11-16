package game.monster.locationBosses;

import game.monster.Monster;
import game.weapon.monstersWeapon.locationBosses.IceStaff;

public class IceGolem<T extends IceStaff> extends Monster<T> {

    public IceGolem(T weapon) {
        super(weapon, 250, 50, 70, 55, 100);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
