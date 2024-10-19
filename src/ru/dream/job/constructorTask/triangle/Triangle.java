package ru.dream.job.constructorTask.triangle;

/**
 * Создание класса "Треугольник":
 *
 * Создайте класс Triangle с полями для трех сторон треугольника.
 * Реализуйте конструктор по умолчанию, который задает равносторонний треугольник.
 * Реализуйте параметризованный конструктор для произвольного треугольника.
 * Напишите метод для вычисления площади треугольника и протестируйте оба конструктора.
 */
public class Triangle {

    private int one;
    private int two;
    private int three;

    /**
     * создание равностороннего треугольника через конструктор по умолчанию
     */
    public Triangle() {
        this.one = 60;
        this.two = 60;
        this.three = 60;
    }

    /**
     * создание параметрализированного конструктора
     * @param one
     * @param two
     * @param three
     */
    public Triangle(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    /**
     * метод который позволяет вычислить площадь треугольника
     * @return
     */
    public double calculateArea() {
        double semiPerimeter = (one + two + three) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - one) * (semiPerimeter - two) * (semiPerimeter - three));
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }
}
