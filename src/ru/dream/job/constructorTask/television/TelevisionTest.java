package ru.dream.job.constructorTask.television;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TelevisionTest {

    @Test
    @DisplayName("Тест конструктора по умолчанию, что он пустой, затем создаем телевизор и проверяем создание")
    public void testDefaultConstructor() {
        Television tv = new Television();
        assertNull(tv.getBrand());
        assertEquals(0, tv.getScreenSize());
        assertNull(tv.getPermission());
        tv.setBrand("Samsung");
        tv.setScreenSize(55);
        tv.setPermission("4K UHD");
        assertEquals("Samsung", tv.getBrand());
        assertEquals(55, tv.getScreenSize());
        assertEquals("4K UHD", tv.getPermission());
    }

    @Test
    @DisplayName("Тест конструктора с брендом и размером экрана")
    public void testConstructorWithBrandAndScreenSize() {
        Television tv = new Television("Samsung", 55);
        assertEquals("Samsung", tv.getBrand());
        assertEquals(55, tv.getScreenSize());
        assertNull(tv.getPermission());
    }

    @Test
    @DisplayName("Тест конструктора с полным набором параметров")
    public void testConstructorWithAllParameters() {
        Television tv = new Television("LG", 65, "4K UHD");
        assertEquals("LG", tv.getBrand());
        assertEquals(65, tv.getScreenSize());
        assertEquals("4K UHD", tv.getPermission());
    }
}
