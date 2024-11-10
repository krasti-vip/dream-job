package game.weapon.person;

import game.weapon.Weapon;

public class StaffHuman implements Weapon {

    @Override
    public void attack() {
        System.out.println("Фаербол!");
    }
}
