package game.person;


import game.weapon.person.Staff;

public class Mage<T extends Staff> extends Hero<T> {

    public Mage(T weapon) {
        super(weapon, 50, 30, 10, 30, 10);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }

    @Override
    public String toString() {
        return "Маг";
    }
}
