package shaiya.game.monster.darkElves;

import shaiya.game.monster.Monster;
import shaiya.game.weapon.monstersWeapon.darkElves.BloodBow;

public class PrinceNuada<T extends BloodBow> extends Monster<T> {

    public PrinceNuada(T weapon) {
        super(weapon, 150, 25, 30, 25, 50);
    }

    @Override
    public String toString() {
        return "Принцесса Нуада вооруженная кровавым луком";
    }
}
