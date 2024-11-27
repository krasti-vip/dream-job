package shaiya.game.Dungeon;
import shaiya.game.monster.InferiorEnemies.Damn;
import shaiya.game.monster.InferiorEnemies.Goblin;
import shaiya.game.monster.darkElves.PrinceNuada;
import shaiya.game.monster.locationBosses.IceGolem;
import shaiya.game.monster.locationBosses.Zuul;
import shaiya.game.weapon.monstersWeapon.darkElves.BloodBowDarkElves;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.StickInferiorEnemies;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaffBoss;
import java.util.List;

public class ListRoom {

    public final static AncientCatacombs ancientCatacombs = new AncientCatacombs(
            List.of(
                    new Room(
                            List.of(
                                    new Damn<>(new StickInferiorEnemies()),
                                    new Damn<>(new StickInferiorEnemies()),
                                    new IceGolem<>(new IceStaffBoss())

                            ), "Ты попадаешь в зал наполненный кучей монстров! Пизда тебе!"
                    ),
                    new Room(List.of(
                            new Goblin<>(new StickInferiorEnemies()),
                            new PrinceNuada<>(new BloodBowDarkElves()),
                            new Zuul<>(new IceStaffBoss())

                    ), "Ты попадаешь на следующий уровень подземелья!!!")
            )
    );
}
