package shaiya.game.weapon.monstersWeapon.inferiorEnemies;

public class StickInferiorEnemies implements Stick {

    @Override
    public int getDamage() {
        System.out.println("Удар палкой");
        return 5;
    }
}
