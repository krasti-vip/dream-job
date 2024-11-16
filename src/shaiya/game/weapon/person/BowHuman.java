package shaiya.game.weapon.person;

public class BowHuman implements Bow {

    @Override
    public int getDamage() {
        System.out.println("Выстрел!");
        return 5;
    }
}
