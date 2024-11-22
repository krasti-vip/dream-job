package shaiya.game.weapon.person;

import lombok.Data;

@Data

public class BowHuman implements Bow {

    @Override
    public int getDamage() {
        System.out.println("Ты делаешь выстрел!");
        return 5;
    }
}
