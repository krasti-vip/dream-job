package shaiya.game.Dungeon;

import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;

import java.util.List;

public class Room {

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
            System.out.println("Ты сражаешься с монстром: " + monster);


            while (hero.isAlive() && monster.isAlive()) {
                hero.attack(monster);

                if (!monster.isAlive()) {
                    break;
                }

                monster.attackDamage(hero);
            }

            if (!hero.isAlive()) {
                System.out.println("Game over!");
            }

            System.out.println("Получаем лут за монстра");

        }

    }
}
