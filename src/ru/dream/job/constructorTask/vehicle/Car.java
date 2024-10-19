package ru.dream.job.constructorTask.vehicle;

/**
 * прописываем что машина наследует от класса Vehicle
 */
public class Car extends Vehicle {

    private String engineType;

    /** реализуем конструктор с унаследаванными полями от родительского класса
     *
     * @param model
     * @param engineType
     */
    public Car(String model, String engineType) {
        super(model);
        this.engineType = engineType;
    }
}
