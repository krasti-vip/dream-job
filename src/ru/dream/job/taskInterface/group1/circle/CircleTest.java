package ru.dream.job.taskInterface.group1.circle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    Circle circle = new Circle(5);

    @Test
    void drawTest() {
        circle.draw(); //не нужно, просто чтобы посмотреть что сообщение выводится

        Assertions.assertEquals(5, circle.getCircle(),"Радиус должен быть 5");
    }

    @Test
    void resizeTest() {
        circle.resize();

        Assertions.assertEquals(10,circle.getCircle(), "Радиус должен быть 10");
    }

    @Test
    void printDetailsTest() {
        circle.resize();
        circle.printDetails();
    }
}
