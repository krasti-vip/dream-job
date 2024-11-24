package shaiya.game.inventory;

import shaiya.game.person.Hero;

public class JarOfSap implements Lut {

    private final int countHp = 50;

    private final String uniqName = "JarOfSap";

    private final String title = "Банка наполненная странной жидкостью, " +
            "возможно восстановит тебе здоровье или добьет окончательно!";

    private int count = 1;

    @Override
    public void apply(Hero<?> hero) {
        hero.setHp(hero.getHp() + countHp);
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
        return "JarOfSap{" +
                "countHp=" + countHp +
                ", uniqName='" + uniqName + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }
}
