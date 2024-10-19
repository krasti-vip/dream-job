package ru.dream.job.taskInterface.group1.circle;

public class Circle implements Drawable {

    private int circle;

    public Circle(int circle) {
        this.circle = circle;
    }

    @Override
    public void draw() {
        System.out.println("Радиус круга " + circle);

    }

    @Override
    public void resize() {
        circle = circle * 2;
        System.out.println("Новый радиус круга " + circle);
    }

    @Override
    public void printDetails() {
        System.out.println("Круг с радиусом: " + circle);
    }

    public int getCircle() {
        return circle;
    }

}
