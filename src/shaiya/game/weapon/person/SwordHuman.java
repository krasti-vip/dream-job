package shaiya.game.weapon.person;

public class SwordHuman implements Sword {

    @Override
    public int getDamage() {
        System.out.println("Удар!");
        return 5;
    }
}
