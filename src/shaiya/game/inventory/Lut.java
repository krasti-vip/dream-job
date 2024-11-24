package shaiya.game.inventory;

import shaiya.game.person.Hero;


public interface Lut {

    void apply(Hero<?> hero);

    String getUniqName();

    int getCount();

    void setCount(int count);

    String getTitle();
}
