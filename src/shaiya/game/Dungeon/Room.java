package shaiya.game.Dungeon;

import shaiya.game.Registration;
import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;
import shaiya.game.person.Lut;

import java.util.List;
import java.util.Scanner;

import static shaiya.game.Shaiya.MAIN_MENU;
import static shaiya.game.Shaiya.ancientCatacombs;

public class Room {

    Registration registration = new Registration();

    Lut lut = new Lut();

    Scanner scanner = new Scanner(System.in);

    private final List<Monster<?>> monsters;

    private final String title;

    public Room(List<Monster<?>> list, String title) {
        this.monsters = list;
        this.title = title;
    }

    public void monsterBattlesLaunch(Hero<?> hero) {
        System.out.println(title);
        System.out.println("Количество монстров в комнате: " + monsters.size());
        System.out.println(monsters);


        for (Monster<?> monster : monsters) {
            System.out.println();
            System.out.println("Ты сражаешься с монстром: " + monster);
            System.out.println("Вступить в бой? да или нет?");

            boolean correctEnter = false;

            while (!correctEnter) {

                final var target = scanner.next();
                correctEnter = registration.userEnter(target, List.of("да", "нет"));

                if (correctEnter && target.equalsIgnoreCase("да")) {

                    while (hero.isAlive() && monster.isAlive()) {
                        hero.attack(monster);

                        if (!monster.isAlive()) {
                            System.out.println("Получаем лут за монстра " + lut.toString());
                            hero.addLoot(lut.getBanka());
                            break;
                        }

                        monster.attackDamage(hero);

                        if (hero.isAlive() && monster.isAlive()) {
                            System.out.println();
                            System.out.println("желаешь продолжить бой или сбежать? Твое здоровье " + hero.getHp() + " здоровье " +
                                    "монстра " + monster.getHp());
                            System.out.println("""
                                    1. Продолжить бой
                                    2. Восстановить здоровье банкой + 50 hp и продолжить бой
                                    3. Сбежать
                                    """);

                            final String action = scanner.next();
                            if (action.equals("2")) {
                                hero.setHp(hero.getHp() + 50);
                                System.out.println("Твое здоровье " + hero.getHp());
                                System.out.println("Продолжаем бой");
                            }
                            if (action.equals("3")) {
                                System.out.println("Трусливая скотина, вернемся к началу подземелья!");
                                ancientCatacombs.start(hero);
                            }

                            if (!hero.isAlive()) {
                                System.out.println("Game over! Ты побежден!");
                                ancientCatacombs.start(hero);
                            }
                        }
                    }

                } else if (target.equalsIgnoreCase("нет")) {
                    System.out.println("Трусливая скотина, вернемся к началу подземелья");

                    ancientCatacombs.start(hero);
                }
            }
        }
        /**
         * не знаю как выйти в основное меню
         */
        System.out.println();
        System.out.println("Ты одержал ни фиговую победу и выбираешься из подземелья делая вдох полной грудью на свежем воздухе!!!");
        System.out.println();
        System.out.println(MAIN_MENU);

        final var target2 = scanner.nextInt();

        if (target2 == 1) {
            System.out.println("При попытки пройти дальше, под вами ломается мост, Вы падаете в пропасть и погибаете" +
                    "игра завершена, пока, лох!");
            return;

        } if (target2 == 2) {
            System.out.println("На Вас упал камень, Вас не откачали и Вы превратились в корм для червей, игра завершена");
            return;

        } if (target2 == 3) {
            ancientCatacombs.start(hero);
        }
    }
}
