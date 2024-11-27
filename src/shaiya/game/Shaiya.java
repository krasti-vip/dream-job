package shaiya.game;
import shaiya.game.person.Hero;
import java.util.Scanner;

import static shaiya.game.Dungeon.ListRoom.ancientCatacombs;

public class Shaiya {

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

            final var target = scanner.next();

            if (target.equalsIgnoreCase("1")) {
                System.out.println("При попытки пройти дальше, под вами ломается мост, Вы падаете в пропасть и погибаете" +
                        "игра завершена, пока, лох!");
            } else if (target.equalsIgnoreCase("2")) {
                System.out.println("На Вас упал камень, Вас не откачали и Вы превратились в корм для червей, игра завершена");
            } else if (target.equalsIgnoreCase("3")) {
                ancientCatacombs.start(hero);
            } else if (target.equalsIgnoreCase("4")) {
                break;
            }
        }
    }
}
