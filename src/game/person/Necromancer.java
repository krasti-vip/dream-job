package game.person;

import game.weapon.person.DarkStaff;

public class Necromancer<T extends DarkStaff> extends Hero<T> {

    public Necromancer(T weapon) {
        super(weapon, 50, 30, 10, 30, 10);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }

    @Override
    public String toString() {
        return "Некромант";
    }
}
