package shaiya.game.person;


import shaiya.game.weapon.person.Sword;

public class Warrior<T extends Sword> extends Hero<T> {

    public Warrior(T weapon) {
        super(weapon, 150, 10, 30, 5, 10);
    }

    @Override
    public String toString() {
        return "Воин";
    }
}
