package ru.dream.job.constructorTask.product;

/**
 * Магазин товаров (класс "Product"):
 *
 * Создайте класс Product с полями: название товара, цена, количество на складе.
 * Реализуйте конструкторы для создания товара с заданной ценой и количеством, а также по умолчанию.
 * Напишите метод для увеличения или уменьшения количества товара на складе.
 * Создайте несколько объектов класса и проведите операции над ними.
 */
public class Product {

    private String name;
    private double price;
    private int stock;

    /**
     * создаем конструктор по умолчанию, а так же параметрализированный конструктор
     */
    public Product() {}

    public Product(String productName, double price, int stock) {
        this.name = productName;
        this.price = price;
        this.stock = stock;
    }

    /**
     * метод который прибавляет количество товара к количеству на складе, чтобы отнять количество товара со склада.
     * цифра должна быть отрицательной, так же присутствует проверка, на количество единиц на складе (возможно ли забрать
     * определенное значение со склада)
     * @param amount
     */
    public void changeStock(int amount) {
        if (this.stock + amount >= 0) {
            this.stock += amount;
            System.out.println("Количество товара изменено на " + amount + ". Текущий запас: " + this.stock);
        } else {
            System.out.println("Недостаточно товара на складе для уменьшения на " + amount);
        }
    }

    /**
     * метод который выводит информацию о товаре со склада
     */
    public void displayInfo() {
        System.out.println("Товар: " + this.name);
        System.out.println("Цена: " + this.price);
        System.out.println("Количество на складе: " + this.stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
