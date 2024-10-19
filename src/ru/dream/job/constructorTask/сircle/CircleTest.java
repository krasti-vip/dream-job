package ru.dream.job.constructorTask.сircle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @Test
    @DisplayName("Тест конструктора по умолчанию")
    public void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), "Радиус по умолчанию должен быть 1.0");
    }

    @Test
    @DisplayName("Тест конструктора с заданным радиусом")
    public void testConstructorWithRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), "Радиус должен быть равен 5.0");
    }

    @Test
    @DisplayName("Тест метода для вычисления площади")
    public void testCalculateArea() {
        Circle circle = new Circle(3.0);
        double expectedArea = Math.PI * 3.0 * 3.0;
        assertEquals(expectedArea, circle.calculateArea(), "Неправильное вычисление площади");
    }

    @Test
    @DisplayName("Тест метода для вычисления длины окружности")
    public void testCalculateCircumference() {
        Circle circle = new Circle(2.0);
        double expectedCircumference = 2 * Math.PI * 2.0;
        assertEquals(expectedCircumference, circle.calculateCircumference(), "Неправильное вычисление длины окружности");
    }

    @Test
    @DisplayName("Тест сеттера для радиуса с правильным значением")
    public void testSetRadiusValid() {
        Circle circle = new Circle();
        circle.setRadius(4.0);
        assertEquals(4.0, circle.getRadius(), "Радиус должен быть равен 4.0");
    }

    @Test
    @DisplayName("Тест сеттера для радиуса с недопустимым значением")
    public void testSetRadiusInvalid() {
        Circle circle = new Circle();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            circle.setRadius(-1.0);
        });
        assertEquals("Радиус должен быть положительным числом", exception.getMessage());
    }

    @Test
    @DisplayName("Тест конструктора с недопустимым радиусом")
    public void testConstructorWithInvalidRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circle(-5.0);
        });
        assertEquals("Радиус должен быть положительным числом", exception.getMessage());
    }
}
