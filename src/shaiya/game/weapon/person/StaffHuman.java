package shaiya.game.weapon.person;

public class StaffHuman implements Staff {

    @Override
    public int getDamage() {
        System.out.println("Фаербол!");
        return 5;
    }
}
