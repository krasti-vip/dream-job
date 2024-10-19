package ru.dream.job.constructorTask.employee;

/**
 * Класс "Сотрудник":
 *
 * Создайте класс Employee с полями: имя, должность, зарплата.
 * Реализуйте конструктор по умолчанию и параметризованный конструктор.
 * Добавьте в класс метод для увеличения зарплаты на заданный процент.
 * Создайте несколько объектов класса Employee, инициализировав их через разные конструкторы, и увеличьте их зарплату.
 */

public class Employee {

    private String name;
    private String post;
    private double salary;

    /**
     * создаем конструктор по умолчанию, затем параметрализированный конструктор
     */
    public Employee() {}

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    /**
     * метод который позволяет увеличить зарплату сотруднику на заданный процент, а так же проверяет, польше ли 0
     * зарплата
     */
    public void bigSalary() {
        if(salary > 0) {
            salary = salary * 1.13;
        } else {
            System.out.println("Для увеличение зарплаты, она хотябы должна быть 1 рубль");
        }
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
