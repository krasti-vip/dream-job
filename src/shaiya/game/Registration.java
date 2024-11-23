package shaiya.game;

import shaiya.game.person.*;
import shaiya.game.weapon.person.BowHuman;
import shaiya.game.weapon.person.DarkStaffNecromancer;
import shaiya.game.weapon.person.StaffHuman;
import shaiya.game.weapon.person.SwordHuman;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Registration {

    private static final Set<String> registeredUserNames = new HashSet<>();

    private static final Scanner scanner = new Scanner(System.in);

    public Hero<?> registration() {
        Hero<?> hero = null;

        System.out.println("""
                |==================================================|
                |Добро пожаловать в мир игры "Теос: желание богини"|
                |Выберите пункт меню:                              |
                |1. Регистрация                                    |
                |2. Авторизация                                    | 
                |==================================================|
                """);

        while (true) {
            var userTarget = scanner.next();
            final var correctEnter = userEnter(userTarget, List.of("1", "2"));

            while (correctEnter) {

                if (correctEnter) {
                    if (userTarget.equals("1")) {
                        System.out.println("Начнем Вашу регистрацию!!!");
                        System.out.println("Введите имя персонажа: ");

                        final var userName = scanner.next();
                        final var correctUserName = userEnter(userName, List.of());

                        if (registeredUserNames.contains(userName)) {
                            System.out.println("Этот ник уже используется. Пожалуйста, выберите другой.");
                        } else {
                            registeredUserNames.add(userName);

                            boolean heroSelected = true;

                            while (heroSelected) {

                                System.out.println("""
                                        |================================================================|
                                        |Выберите класс героя, вам доступны: "                           |
                                        |1. Лучник (обладает высокой ловкость и никогда не промахивается |
                                        |2. Маг (эффективен против воинов)                               |
                                        |3. Некромант (темное воплощение мага)                           |
                                        |4. Воин (обладает огромным запасом здоровья)                    | 
                                        |================================================================|               
                                        """);

                                var userTarget2 = scanner.next();
                                final var correctEnter2 = userEnter(userTarget, List.of("1", "2", "3", "4"));

                                if (correctEnter2) {
                                    if (userTarget2.equals("1")) {
                                        BowHuman bow = new BowHuman();
                                        hero = new Archer<>(bow);

                                    } else if (userTarget2.equals("2")) {
                                        StaffHuman staff = new StaffHuman();
                                        hero = new Mage<>(staff);

                                    } else if (userTarget2.equals("3")) {
                                        DarkStaffNecromancer staff = new DarkStaffNecromancer();
                                        hero = new Necromancer<>(staff);

                                    } else if (userTarget2.equals("4")) {
                                        SwordHuman swordHuman = new SwordHuman();
                                        hero = new Warrior<>(swordHuman);

                                    } else {
                                        System.out.println("Некорректный выбор класса героя. Пожалуйста, выберите снова.");
                                        continue;
                                    }

                                    heroSelected = false;
                                }
                            }

                            System.out.println("Регистрация завершена, ваш ник в игре: " + userName + " его " + "класс " + hero);

                            break;
                        }

                        break;
                    } else if (userTarget.equals("2")) {
                        System.out.println("Авторизацию реализуем в новом тысячелетии, пока просто помечтай!!!");
                    }
                }
            }
            break;
        }

        return hero;
    }

    public boolean userEnter(String sc, List<String> correctValues) {
        if (sc == null || sc.isEmpty()) {
            System.out.println("Ввод данных не удачен, введите корректное значение!!!");
            System.out.println("Вот такие: " + correctValues + " Тупица!!!!");
            return false;
        } else {
            if (correctValues.size() == 0 || correctValues.contains(sc)) {
                return true;
            }
        }
        System.out.println("Как ты заебал!!!! подумай еще!!!!");
        return false;
    }

    public String checkingInputCorrectInPerpetualLoop(List<String> correctValues, Scanner scanner) {
        if (scanner == null || correctValues == null) {
            throw new NullPointerException();
        }

        var userTarget = scanner.next().toLowerCase();

        while (!correctValues.contains(userTarget)) {
            System.out.println("Ты ввел неверное значение куница!");
            System.out.println("Доступные варрианты: ");

            for (String correctValue : correctValues) {
                System.out.println(correctValue);
            }

            userTarget = scanner.next().toLowerCase();
        }

        return userTarget;
    }


    /**
     * |=======================
     * |Добро пожаловать в мир игры ....
     * |1. Регистрация
     * |2. Авторизация
     * |=======================
     */

    // 1
    /**
     * |=======================
     * |Выберите класс персонажа:
     * |
     * |
     * |
     * |
     * |=======================
     */

    /**
     * |=======================
     * |Введите ник персонажа:
     * |
     * |
     * |
     * |
     * |=======================
     */

    // Какие характеристики у каждого персонажа?
    // Какая формула урона?
    // Как характеристики повышаются с уровнем персонажа у каждого класса?

    // 2

    /**
     * |=======================
     * |Укажите путь до вашего сохранения:
     * |=======================
     */
}
