package game.monster.locationBosses;

import game.monster.Monster;
import game.weapon.monsters.locationBosses.IceStaff;

public class Zuul<T extends IceStaff> extends Monster<T> {

    public Zuul(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
