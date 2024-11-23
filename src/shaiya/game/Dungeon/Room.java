package shaiya.game.Dungeon;

import shaiya.game.Registration;
import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;
import shaiya.game.person.Lut;

import java.util.List;
import java.util.Scanner;

public class Room {

    private final Registration registration = new Registration();

    private final Lut lut = new Lut();

    private final Scanner scanner = new Scanner(System.in);

    private final List<Monster<?>> monsters;

    private final String title;

    public Room(final List<Monster<?>> list, final String title) {
        this.monsters = list;
        this.title = title;
    }

    public void monsterBattlesLaunch(final Hero<?> hero) {
        boolean desireToRun = false;

        System.out.println(title);
        System.out.println("Количество монстров в комнате: " + monsters.size());
        System.out.println(monsters);


        for (Monster<?> monster : monsters) {
            if (!hero.isAlive() || desireToRun) {
                break;
            }

            System.out.println();
            System.out.println("Ты сражаешься с монстром: " + monster);
            System.out.println("Вступить в бой? да или нет?");

            final var target = registration.checkingInputCorrectInPerpetualLoop(List.of("да", "нет"), scanner);

            if (target.equalsIgnoreCase("да")) {
                while (hero.isAlive() && monster.isAlive()) {
                    hero.attack(monster);

                    if (!monster.isAlive()) {
                        System.out.println("Получаем лут за монстра " + lut);
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
                        } else if (action.equals("3")) {
                            System.out.println("Трусливая скотина, вернемся к началу подземелья!");
                            desireToRun = true;
                            break;
                        } else if (!hero.isAlive()) {
                            System.out.println("Game over! Ты побежден!");
                            break;
                        }
                    }
                }
            } else if (target.equalsIgnoreCase("нет")) {
                System.out.println("Трусливая скотина, вернемся к началу подземелья");
                break;
            }
        }
    }
}
