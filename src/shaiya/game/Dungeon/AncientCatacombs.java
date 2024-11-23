package shaiya.game.Dungeon;

import shaiya.game.Registration;
import shaiya.game.Shaiya;
import shaiya.game.person.Hero;

import java.util.List;
import java.util.Scanner;

public class AncientCatacombs implements Dungeon {

    private final Shaiya shaiya = new Shaiya();

    private final Registration registration = new Registration();

    private final Scanner scanner = new Scanner(System.in);

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
        System.out.println("Желаешь ли ты зайти в первую комнату, да или нет?");

        final var target = registration.checkingInputCorrectInPerpetualLoop(List.of("да", "нет"), scanner);
        System.out.println();

        if (target.equalsIgnoreCase("да")) {
            for (Room room : rooms) {
                room.monsterBattlesLaunch(hero);
            }
        } else if (target.equalsIgnoreCase("нет")) {
            System.out.println("Вышли из комнат!");
        }
    }
}
