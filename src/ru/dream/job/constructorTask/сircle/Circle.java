package ru.dream.job.constructorTask.сircle;

/**
 * Создание класса "Круг" с конструктором для вычислений:
 *
 * Создайте класс Circle, который содержит радиус.
 * Реализуйте два конструктора: один для круга с радиусом по умолчанию, другой — для круга с заданным радиусом.
 * Напишите метод для вычисления площади и длины окружности.
 * Протестируйте работу, создав несколько объектов класса.
 */
public class Circle {

    private double radius;

    // Конструктор по умолчанию (радиус = 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Конструктор с заданным радиусом и проверкой на отрицательное значение
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Радиус должен быть положительным числом");
        }
    }

    // Метод для вычисления площади круга
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Геттер для радиуса
    public double getRadius() {
        return radius;
    }

    // Сеттер для радиуса, с проверкой отрицательного значения
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Радиус должен быть положительным числом");
        }
    }
}
