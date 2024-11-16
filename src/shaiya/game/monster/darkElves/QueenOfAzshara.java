package shaiya.game.monster.darkElves;

import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.darkElves.BloodBow;

public class QueenOfAzshara<T extends BloodBow> extends Monster<T> {

    public QueenOfAzshara(T weapon) {
        super(weapon, 150, 25, 30, 25, 50);
    }
}
