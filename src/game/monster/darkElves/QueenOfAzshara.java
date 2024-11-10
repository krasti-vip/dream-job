package game.monster.darkElves;

import game.monster.Monster;
import game.weapon.monsters.darkElves.BloodBow;

public class QueenOfAzshara<T extends BloodBow> extends Monster<T> {

    public QueenOfAzshara(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
