package shaiya.game.weapon.monstersWeapon.darkElves;

public class BloodBowDarkElves implements BloodBow {

    @Override
    public int getDamage() {
        System.out.println("Выстрел кровавой стрелой");
        return 5;
    }
}
