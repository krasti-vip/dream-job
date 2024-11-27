package shaiya.game.Dungeon;
import shaiya.game.battle.Battle;
import shaiya.game.Registration;
import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;
import java.util.List;
import java.util.Scanner;

public class Room {

    private final Registration registration = new Registration();

    private final Scanner scanner = new Scanner(System.in);

    private final List<Monster<?>> monsters;

    private final String title;

    Battle battle = new Battle();

    public Room(final List<Monster<?>> list, final String title) {
        this.monsters = list;
        this.title = title;
    }

    public boolean monsterBattlesLaunch(final Hero<?> hero) {
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
                battle.executeBattle(hero, monster);

            } else if (target.equalsIgnoreCase("нет")) {
                System.out.println("Трусливая скотина, вернемся к началу подземелья");
                return false;
            }
        }
        return desireToRun = true;
    }
}
