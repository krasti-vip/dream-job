package ru.dream.job.taskInterface.group1.robot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotTest {

    Robot robot = new Robot();

    @Test
    void moveTest() {
       robot.move(10, 20);
        Assertions.assertEquals("(10, 20)",robot.getPosition(), "Робот должен находится на " +
                "позиции: 10, 20");
        Assertions.assertTrue(robot.isMoving(), "Робот должен двигаться");
    }

    @Test
    void stopTest() {
        robot.move(10, 20);
        robot.stop();
        Assertions.assertFalse(robot.isMoving());
    }

    @Test
    void saveAndLoadTest() {
        robot.move(5, 40);
        robot.save();

        robot.move(20, 45);
        Assertions.assertEquals("(20, 45)", robot.getPosition());

        robot.load();
        Assertions.assertEquals("(5, 40)", robot.getPosition(), "Робот должен вернуться на сохраненные координаты");
        Assertions.assertTrue(robot.isMoving(), "Робот должен двигаться");
    }


}
