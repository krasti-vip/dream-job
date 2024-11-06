package game.person;


import game.weapon.person.Sword;

public class    Warrior<T extends Sword> extends Hero<T> {

    public Warrior(T weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.weapon.attack();
    }
}
