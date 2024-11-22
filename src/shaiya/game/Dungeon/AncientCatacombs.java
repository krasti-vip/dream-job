package shaiya.game.Dungeon;
import shaiya.game.Registration;
import shaiya.game.Shaiya;
import shaiya.game.person.Hero;

import java.util.List;
import java.util.Scanner;

import static shaiya.game.Shaiya.MAIN_MENU;
import static shaiya.game.Shaiya.ancientCatacombs;

public class AncientCatacombs implements Dungeon {

    Shaiya shaiya = new Shaiya();

    Registration registration = new Registration();

    Scanner scanner = new Scanner(System.in);

    private final String title = """
                    Давным-давно город процветал благодаря магии и знаниям его жителей. 
                    Жрец Арканус, одержимый жаждой бессмертия, начал изучать запретные искусства некромантии. 
                    Его эксперименты привели к катастрофе: темная энергия уничтожила город, а жители превратились в нежить. 
                    Теперь Арканус скрывается в глубинах катакомб, готовясь к возвращению и захвату мира живых.
            """;

    private final List<Room> rooms;

    public AncientCatacombs(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public void start(Hero<?> hero) {
        System.out.println(title);


        while (true) {

            System.out.println("Желаешь ли ты зайти в первую комнату, да или нет?");

            final var target = scanner.next();
            final var correctEnter = registration.userEnter(target, List.of("да", "нет"));
            System.out.println();

            while (correctEnter) {
                if (correctEnter && target.equalsIgnoreCase("да")) {

                    for (Room room : rooms) {
                        room.monsterBattlesLaunch(hero);
                    }
                    /**
                     * не знал как сослаться к основному меню, снял везде приваты и скопировал
                     */
                } else if (target.equalsIgnoreCase("нет")) {
                    System.out.println("Трусливая скотина, вернемся к выбору пути"); //тут должен быть возврат в основное меню

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
        }
    }
}
