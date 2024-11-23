package shaiya.game.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shaiya.game.monster.InferiorEnemies.Damn;
import shaiya.game.monster.InferiorEnemies.Goblin;
import shaiya.game.monster.darkElves.PrinceNuada;
import shaiya.game.monster.darkElves.QueenOfAzshara;
import shaiya.game.monster.locationBosses.IceGolem;
import shaiya.game.monster.locationBosses.Zuul;
import shaiya.game.weapon.monstersWeapon.darkElves.BloodBowDarkElves;
import shaiya.game.weapon.monstersWeapon.inferiorEnemies.StickInferiorEnemies;
import shaiya.game.weapon.monstersWeapon.locationBosses.IceStaffBoss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MonsterTest {

    @Test
    @DisplayName("Тест PrinceNuada и урона оружия")
    public void nuidaTest() {

        BloodBowDarkElves bloodBowDarkElves = new BloodBowDarkElves();
        PrinceNuada princeNuada = new PrinceNuada(bloodBowDarkElves);

        assertNotNull(princeNuada);

        assertEquals(150, princeNuada.getHp());
        assertEquals(25, princeNuada.getMana());
        assertEquals(30, princeNuada.getPower());
        assertEquals(25, princeNuada.getIntelligence());
        assertEquals(50, princeNuada.getDexterity());

        assertEquals(5, bloodBowDarkElves.getDamage());
    }

    @Test
    @DisplayName("Тест QueenOfAzshara")
    public void azsharaTest() {

        BloodBowDarkElves bloodBowDarkElves = new BloodBowDarkElves();
        QueenOfAzshara queenOfAzshara = new QueenOfAzshara(bloodBowDarkElves);

        assertNotNull(queenOfAzshara);

        assertEquals(150, queenOfAzshara.getHp());
        assertEquals(25, queenOfAzshara.getMana());
        assertEquals(30, queenOfAzshara.getPower());
        assertEquals(25, queenOfAzshara.getIntelligence());
        assertEquals(50, queenOfAzshara.getDexterity());

        assertEquals(5, bloodBowDarkElves.getDamage());
    }

    @Test
    @DisplayName("Тест Damn")
    public void damnTest() {

        StickInferiorEnemies stickInferiorEnemies = new StickInferiorEnemies();
        Damn damn = new Damn(stickInferiorEnemies);

        assertNotNull(damn);

        assertEquals(30, damn.getHp());
        assertEquals(5, damn.getMana());
        assertEquals(7, damn.getPower());
        assertEquals(5, damn.getIntelligence());
        assertEquals(10, damn.getDexterity());

        assertEquals(5, stickInferiorEnemies.getDamage());
    }

    @Test
    @DisplayName("Тест Goblin")
    public void goblinTest() {

        StickInferiorEnemies stickInferiorEnemies = new StickInferiorEnemies();
        Goblin goblin = new Goblin<>(stickInferiorEnemies);

        assertEquals(30, goblin.getHp());
        assertEquals(5, goblin.getMana());
        assertEquals(7, goblin.getPower());
        assertEquals(5, goblin.getIntelligence());
        assertEquals(10, goblin.getDexterity());

        assertEquals(5, stickInferiorEnemies.getDamage());
    }

    @Test
    @DisplayName("Тест IceGolem")
    public void iceGolemTest() {

        IceStaffBoss iceStaffBoss = new IceStaffBoss();
        IceGolem iceGolem = new IceGolem<>(iceStaffBoss);

        assertEquals(250, iceGolem.getHp());
        assertEquals(50, iceGolem.getMana());
        assertEquals(5, iceGolem.getPower());
        assertEquals(5, iceGolem.getIntelligence());
        assertEquals(10, iceGolem.getDexterity());

        assertEquals(5, iceStaffBoss.getDamage());
    }

    @Test
    @DisplayName("Тест Zuul")
    public void zuulTest() {

        IceStaffBoss iceStaffBoss = new IceStaffBoss();
        Zuul zuul = new Zuul<>(iceStaffBoss);

        assertEquals(250, zuul.getHp());
        assertEquals(50, zuul.getMana());
        assertEquals(70, zuul.getPower());
        assertEquals(55, zuul.getIntelligence());
        assertEquals(100, zuul.getDexterity());

        assertEquals(5, iceStaffBoss.getDamage()); //повтор
    }

}
