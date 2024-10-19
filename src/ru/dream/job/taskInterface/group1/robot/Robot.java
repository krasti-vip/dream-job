package ru.dream.job.taskInterface.group1.robot;

public class Robot implements Movable, Storable {

    private int x;

    private int y;

    private boolean isMoving;

    private int savedX;

    private int savedY;

    private boolean savedIsMoving;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.isMoving = false;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        this.isMoving = true;
        System.out.println("Робот перемещается на координаты: " + x + ", " + y);
    }

    @Override
    public void stop() {
        this.isMoving = false;
        System.out.println("Робот остановился на координатах " + x + ", " + y);
    }

    @Override
    public void save() {
        savedX = x;
        savedY = y;
        System.out.println("Состояние робота сохранено в базу данных " + x + ", " + y);

    }

    @Override
    public void load() {
        this.x = savedX;
        this.y = savedY;
        System.out.println("Состояние робота загружено из базу данных " + x + ", " + y);
    }

    public String getPosition() {

        return "(" + x + ", " + y + ")";
    }

    public boolean isMoving() {

        return isMoving;
    }
}
