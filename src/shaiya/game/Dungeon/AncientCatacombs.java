package shaiya.game.Dungeon;

import shaiya.game.monster.Monster;
import shaiya.game.person.Hero;

import java.util.ArrayList;
import java.util.List;

public class AncientCatacombs implements Dungeon {

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

        for (Room room : rooms) {
            room.monsterBattlesLaunch(hero);
        }
    }
}
