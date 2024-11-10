package game.person;


import game.weapon.person.Bow;

public class Archer<T extends Bow> extends Hero<T> {

    public Archer(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
