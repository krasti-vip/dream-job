package ru.dream.job.taskInterface.group1.circle;

public interface Drawable {

    void draw();

    void resize();

    default void printDetails() {
        System.out.println("Фигура нарисована: ");
    }
}
