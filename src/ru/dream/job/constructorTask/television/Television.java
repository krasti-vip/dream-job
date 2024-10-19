package ru.dream.job.constructorTask.television;

/**
 * Создание класса "Телевизор":
 *
 * Создайте класс Television, который содержит поля: бренд, размер экрана, разрешение.
 * Реализуйте несколько конструкторов: без параметров, с брендом и размером экрана, с полным набором параметров.
 * Напишите метод для вывода информации о телевизоре и протестируйте все конструкторы.
 */
public class Television {

    private String brand;
    private int screenSize;
    private String permission;

    /**
     * создание конструкторов по умолчанию, параметрализированнного и имеющего только параметры марки и размера экрана
     */
    public Television() {}

    public Television(String brand, int screenSize, String permission) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.permission = permission;
    }

    public Television(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    /**
     * метод который выводит информацию о телевизоре
     */
    public void displayInfo() {
        System.out.println("Телевизор: " + brand);
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Разрешение: " + permission);
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getPermission() {
        return permission;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
