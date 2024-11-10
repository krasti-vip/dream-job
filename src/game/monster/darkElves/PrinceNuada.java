package game.monster.darkElves;

import game.monster.Monster;
import game.weapon.monsters.darkElves.BloodBow;

public class PrinceNuada<T extends BloodBow> extends Monster<T> {

    public PrinceNuada(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
