package shaiya.game.inventory;

import shaiya.game.person.Hero;

public class DexterityPotion implements Lut {

    private final int countDexterity = 50;

    private final String uniqName = "Зелье_ловкости";

    private final String title = "Банка наполненная странной жидкостью, " +
            "возможно она увеличит тебе ловкость!";

    private int count = 1;

    @Override
    public void apply(Hero<?> hero) {
        hero.setDexterity(hero.getDexterity() + countDexterity);
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
        return "Зелье ловкости";
    }
}
