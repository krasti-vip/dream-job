package shaiya.game.battle;
import java.util.Optional;
import java.util.Scanner;
import shaiya.game.Registration;
import shaiya.game.inventory.Lut;
import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;

import java.util.List;

public class Battle {

    private final Registration registration = new Registration();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Метод принимает героя и монстра с которым предстоит сражаться (создана буленная переменная чтобы можно было
     * окончательно выйти из метода), мы падаем в цикл вайл и если герой и монстр живы сначала атакует герой если
     * монстр мертв то выходим из боя, в противном случае монстр атакует героя, если после этого оба живы предоставляется выбор продолжить бой,
     * применить лут или сбежать, выбор происходить через консоль, если на любом этапе герой умирает то выводся сообщение и выходим из игры,
     * если монстр умирает переходим к следующему монстру пока всех не победим
     */
    public boolean executeBattle(Hero<?> hero, Monster<?> monster) {
        boolean desireToRun = false;

        while (hero.isAlive() && monster.isAlive()) {
            hero.attack(monster);

            if (!monster.isAlive()) {
                retrieveLootWhenMonsterDies(hero, monster);
                break;
            }

            monster.attackDamage(hero);

            if (hero.isAlive() && monster.isAlive()) {
                System.out.println();
                System.out.println("желаешь продолжить бой или сбежать? Твое здоровье " + hero.getHp() + " здоровье " +
                        "монстра " + monster.getHp());
                System.out.println("""
                                1. Продолжить бой
                                2. Применить что нибудь, что у тебя есть!
                                3. Сбежать
                                """);

                final String action = scanner.next();

                if (action.equals("2")) {
                    applyInventory(hero);
                    System.out.println("Хочешь попытаться найти в сумке что нибудь? Да или нет?");
                    final var targetLut = registration.checkingInputCorrectInPerpetualLoop(List.of("да", "нет"), scanner);

                    if (targetLut.equalsIgnoreCase("да")) {
                        applyInventory(hero);
                    } else if (targetLut.equalsIgnoreCase("нет")) {
                        System.out.println("Продолжаем бой ");
                        System.out.println();
                    }

                } else if (action.equals("3")) {
                    System.out.println("Трусливая скотина, вернемся к началу подземелья!");
                    desireToRun = true;
                    break;
                }
            } else if (!hero.isAlive()) {
                System.out.println("Game over! Ты побежден!");
                break;
            }
        }

        return desireToRun;
    }

    /**
     * Метод принимает созданного героя передает на консоль весь инвентарь с помощью метода printInventory и спрашивает
     * что использовать, далее принимает введенное пользователем значение с помощью метода getInput и далее с помощью
     * метода handleLootApplication выводит на консоль данные что сделана или что не сделано
     *
     */
    private void applyInventory(Hero<?> hero) {
        hero.getInventory().printInventory();
        System.out.println("Что ты хочешь использовать?");

        String targetUserLoot = getInput();
        handleLootApplication(hero, targetUserLoot);
    }

    /**
     * Метод считывает данные пользователя о том какой лут он хочет применить
     * @return
     */
    private String getInput() {
        return scanner.next();
    }

    /**
     * Метод принимает героя и лут который хочет применить пользователь, заворачивает в опшинл и проверяет, если лут есть у героя
     * применяет его с помощью метода applyLut, если у пользователя вообще нет лута, то выводит об этом сообщение на консоль,
     * а если у пользователя чтото есть но введено не верное значение то выведет и о этом сообщение
     */
    private void handleLootApplication(Hero<?> hero, String targetUserLoot) {
        Optional<Lut> optionalLut = hero.getLut(targetUserLoot);

        if (optionalLut.isPresent()) {
            applyLut(hero, optionalLut.get());
        } else if (hero.getInventory().getAllLut().isEmpty()) {
            System.out.println("Сумка пуста, дерись так");
        } else {
            System.out.println("Такой вещи у тебя нет, попробуй еще");
        }
    }

    /**
     * Метод принимает героя и лут и применяет его о чем выводит сообщение
     *
     *
     */
    public void applyLut(Hero<?> hero, Lut lut) {
        lut.apply(hero);
        System.out.println("Лут применен! ");
    }

    /**
     * Метод принимает героя и монстра, проверяет есть ли в монстре лут, если есть добавляет герою лут и вовыдит об этом
     * сообщение, если у монстра нет лута сообщает об этом
     */
    private void retrieveLootWhenMonsterDies(Hero<?> hero, Monster<?> monster) {
        List<Lut> monsterLut = monster.getLut();

        if (monsterLut.size() > 0) {
            System.out.println("Из монстра выпало: " + monsterLut);

            for (Lut lut : monster.getLut()) {
                hero.addLoot(lut);
            }
        } else {
            System.out.println("В монстре не оказалось лута :с");
        }
    }
}
