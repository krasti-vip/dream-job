package shaiya.game.person;

import shaiya.game.weapon.person.DarkStaff;

public class Necromancer<T extends DarkStaff> extends Hero<T> {

    public Necromancer(T weapon) {
        super(weapon, 50, 30, 10, 30, 10);
    }
}
