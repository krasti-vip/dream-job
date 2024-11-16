package game.monster.darkElves;

import game.monster.Monster;
import game.weapon.monstersWeapon.darkElves.BloodBow;

public class PrinceNuada<T extends BloodBow> extends Monster<T> {

    public PrinceNuada(T weapon) {
        super(weapon, 150, 25, 30, 25, 50);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
