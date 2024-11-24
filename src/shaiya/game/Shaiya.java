package shaiya.game;

import shaiya.game.Dungeon.AncientCatacombs;
import shaiya.game.Dungeon.Room;
import shaiya.game.monster.InferiorEnemies.Damn;
import shaiya.game.monster.locationBosses.IceGolem;
import shaiya.game.person.Hero;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.StickInferiorEnemies;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaffBoss;

import java.util.List;
import java.util.Scanner;

public class Shaiya {

    public final static AncientCatacombs ancientCatacombs = new AncientCatacombs(
            List.of(
                    new Room(
                            List.of(
                                    new Damn<>(new StickInferiorEnemies()),
                                    new Damn<>(new StickInferiorEnemies()),
                                    new IceGolem<>(new IceStaffBoss())

                            ), "Ты попадаешь в зал наполненный кучей монстров! Пизда тебе!"
                    )
            )
    );
    public final static String MAIN_MENU = """
            
                Искатель приключений, выбери куда ты хочешь отправиться!
            
                1. Пойти в город Винтерфолд - тут ты сможешь продать инвентарь, купить целебные зелья и узнать новости
                2. Пойти в город Вайтран - тут ты сможешь взять задания и сохранить игру
                3. Пойти в 'Древние катакомбы' и попытаться выжить при сражении с его обитателями
                4. Не сохраниться и выйти.
            """;
    private final static Scanner scanner = new Scanner(System.in);
    private final static Registration registration = new Registration();

    public static void main(String[] args) {
        final Hero<?> hero = registration.registration();

        while (true) {
            System.out.println(MAIN_MENU);

            final var target = scanner.nextInt();

            if (target == 1) {
                System.out.println("При попытки пройти дальше, под вами ломается мост, Вы падаете в пропасть и погибаете" +
                        "игра завершена, пока, лох!");
            } else if (target == 2) {
                System.out.println("На Вас упал камень, Вас не откачали и Вы превратились в корм для червей, игра завершена");
            } else if (target == 3) {
                ancientCatacombs.start(hero);
            } else if (target == 4) {
                break;
            }
        }
    }
}
