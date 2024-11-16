package shaiya.game.weapon.person;

public class DarkStaffNecromancer implements DarkStaff {

    @Override
    public int getDamage() {
        System.out.println("Поток костей");
        return 5;
    }
}
