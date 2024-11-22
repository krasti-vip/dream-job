package shaiya.game.person;

import lombok.Data;

@Data
public class Lut {

    private int banka = 50;

    @Override
    public String toString() {
        return "Банка + 50 здоровья";
    }
}
