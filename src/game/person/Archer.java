package game.person;


import game.weapon.person.Bow;

public class Archer<T extends Bow> extends Hero<T> {

    public Archer(T weapon) {
        super(weapon, 75, 5, 15, 5, 30);
    }

    @Override
    public void attack() {
        weapon.attack();
    }

    @Override
    public String toString() {
        return "Лучник";
    }
}
