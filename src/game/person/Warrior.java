package game.person;


import game.weapon.person.Sword;

public class Warrior<T extends Sword> extends Hero<T> {

    public Warrior(T weapon) {
        super(weapon, 150, 10, 30, 5, 10);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }

    @Override
    public String toString() {
        return "Воин";
    }
}
