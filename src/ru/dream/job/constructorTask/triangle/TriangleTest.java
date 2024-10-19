package ru.dream.job.constructorTask.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    @DisplayName("Тестирование конструктора по умолчанию и вычисление площади")
    public void triangTest1() {
        Triangle triangle = new Triangle();

        assertEquals(60, triangle.getOne());
        assertEquals(60, triangle.getTwo());
        assertEquals(60, triangle.getThree());
        assertEquals(1558.8457268119896, triangle.calculateArea());
    }

    @Test
    @DisplayName("Тестирование параматезированного конструктора и вычисление площади")
    public void triagTest2() {
        Triangle triangle = new Triangle(90, 80, 50);

        assertEquals(90, triangle.getOne());
        assertEquals(80, triangle.getTwo());
        assertEquals(50, triangle.getThree());
        assertEquals(1989.97487421324, triangle.calculateArea());
    }
}
