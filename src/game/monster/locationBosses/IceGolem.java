package game.monster.locationBosses;

import game.monster.Monster;
import game.weapon.monsters.locationBosses.IceStaff;

public class IceGolem<T extends IceStaff> extends Monster<T> {

    public IceGolem(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
