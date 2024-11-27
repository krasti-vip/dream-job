package shaiya.game.person;
import shaiya.game.weapon.person.Bow;

public class Archer<T extends Bow> extends Hero<T> {

    public Archer(T weapon) {
        super(weapon, 150, 5, 15, 5, 80);
    }

    @Override
    public String toString() {
        return "Лучник";
    }
}
