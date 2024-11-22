package shaiya.game.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shaiya.game.person.Archer;
import shaiya.game.person.Mage;
import shaiya.game.person.Necromancer;
import shaiya.game.person.Warrior;
import shaiya.game.weapon.person.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonsTest {

    @Test
    @DisplayName("Тест Лучника и урона оружия")
    public void archerTest() {

        Bow bow = new BowHuman();
        Archer archer = new Archer<>(bow);

        assertNotNull(archer);

        assertEquals(75, archer.getHp());
        assertEquals(5, archer.getMana());
        assertEquals(15, archer.getPower());
        assertEquals(5, archer.getIntelligence());
        assertEquals(80, archer.getDexterity());

        assertEquals(5, bow.getDamage());
    }

    @Test
    @DisplayName("Тест мага")
    public void mageTest() {

        StaffHuman staffHuman = new StaffHuman();
        Mage mage = new Mage(staffHuman);

        assertNotNull(mage);

        assertEquals(50, mage.getHp());
        assertEquals(30, mage.getMana());
        assertEquals(10, mage.getPower());
        assertEquals(30, mage.getIntelligence());
        assertEquals(10, mage.getDexterity());

        assertEquals(5, staffHuman.getDamage());
    }

    @Test
    @DisplayName("Тест некроманта")
    public void necromantTest() {

        DarkStaffNecromancer darkStaffNecromancer = new DarkStaffNecromancer();
        Necromancer necromancer = new Necromancer<>(darkStaffNecromancer);

        assertNotNull(necromancer);

        assertEquals(50, necromancer.getHp());
        assertEquals(30, necromancer.getMana());
        assertEquals(10, necromancer.getPower());
        assertEquals(30, necromancer.getIntelligence());
        assertEquals(10, necromancer.getDexterity());

        assertEquals(5, darkStaffNecromancer.getDamage());
    }

    @Test
    @DisplayName("Тест воина")
    public void warriorTest() {

        SwordHuman swordHuman = new SwordHuman();
        Warrior warrior = new Warrior<>(swordHuman);

        assertEquals(150, warrior.getHp());
        assertEquals(10, warrior.getMana());
        assertEquals(30, warrior.getPower());
        assertEquals(5, warrior.getIntelligence());
        assertEquals(10, warrior.getDexterity());

        assertEquals(5, swordHuman.getDamage());
    }
}
