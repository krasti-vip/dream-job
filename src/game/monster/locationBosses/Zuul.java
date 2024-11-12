package game.monster.locationBosses;

import game.monster.Monster;
import game.weapon.monsters.locationBosses.IceStaff;

public class Zuul<T extends IceStaff> extends Monster<T> {

    public Zuul(T weapon) {
        super(weapon, 250, 50, 70, 55, 100);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
