package ru.dream.job.constructorTask.vehicle;

/**
 * Конструкторы и наследование:
 *
 * Создайте базовый класс Vehicle с полем model (модель транспортного средства).
 * Создайте подкласс Car, который дополнительно содержит поле engineType (тип двигателя).
 * Реализуйте конструкторы для обоих классов, инициализирующие все поля.
 * Продемонстрируйте работу конструкторов, создавая объекты класса Car.
 */
public class Vehicle {

    private String model;

    /**
     * реализуем параметрализированный конструктор
     * @param model
     */
    public Vehicle(String model) {
        this.model = model;
    }
}
