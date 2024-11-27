package shaiya.game.inventory;

import shaiya.game.person.Hero;

public class PowerJar implements Lut {

    private final int countPower = 50;

    private final String uniqName = "Зелье_силы";

    private final String title = "Сосуд переливающейся на солнце с надпись:  " +
            "эликсир большого бицепса!";

    private int count = 1;

    @Override
    public void apply(Hero<?> hero) {
        hero.setPower(hero.getPower() + countPower);
        count--;
    }

    @Override
    public String getUniqName() {
        return uniqName;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Зелье силы";
    }
}
