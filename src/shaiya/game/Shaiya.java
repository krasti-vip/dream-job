package shaiya.game;

import shaiya.game.Dungeon.AncientCatacombs;
import shaiya.game.Dungeon.Room;
import shaiya.game.monster.InferiorEnemies.Damn;
import shaiya.game.person.Hero;
import shaiya.game.weapon.Weapon;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.StickInferiorEnemies;

import java.util.List;
import java.util.Scanner;

public class Shaiya {

    private final static Scanner scanner = new Scanner(System.in);

    private final static Registration registration = new Registration();

    private final static AncientCatacombs ancientCatacombs = new AncientCatacombs(
            List.of(
                    new Room(
                            List.of(
                                  new Damn<>(new StickInferiorEnemies()),
                                  new Damn<>(new StickInferiorEnemies())
                            ), "Ты попадаешь в зал наполненный кучей монстров! Пизда тебе!"
                    )
            )
    );

    private final static String MAIN_MENU = """
                1. Пойти в город Винтерфолд
                2. Пойти в город Вайтран 
                3. Пойти в 'Древние катакомбы'
            """;


    public static void main(String[] args) {
        final Hero<?> hero = registration.registration();
        System.out.println(MAIN_MENU);
        final var target = scanner.nextInt();

        if (target == 3) {
            ancientCatacombs.start(hero);
        }
    }
}
