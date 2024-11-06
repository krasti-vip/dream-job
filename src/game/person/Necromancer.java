package game.person;

import game.weapon.person.DarkStaff;

public class Necromancer<T extends DarkStaff> extends Hero<T> {

    public Necromancer(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }
}
