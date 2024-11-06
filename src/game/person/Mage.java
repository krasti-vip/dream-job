package game.person;


import game.weapon.person.Staff;

public class Mage<T extends Staff> extends Hero<T> {

    public Mage(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }
}
