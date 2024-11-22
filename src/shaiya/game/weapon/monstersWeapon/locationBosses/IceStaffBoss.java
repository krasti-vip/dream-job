package shaiya.game.weapon.monstersWeapon.locationBosses;

public class IceStaffBoss implements IceStaff {

    @Override
    public int getDamage() {
        System.out.println("Монстр бьет ледяным шаром!");
        return 5;
    }
}
