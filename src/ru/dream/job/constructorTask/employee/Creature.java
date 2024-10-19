package ru.dream.job.constructorTask.employee;

public class Creature {
    public static void main(String[] args) {
/**
 * Проверяем работу создания сотрудника, через конструктор по умолчанию и параметрализированный, а затем увеличиваем
 * им зарплату через метод bigSalary()
 */
        Employee employee1 = new Employee("Дима", "Клерк", 50000);

        Employee employee2 = new Employee();
        employee2.setName("Вася");
        employee2.setPost("Старший Клерк");
        employee2.setSalary(75000);

        employee1.bigSalary();
        employee2.bigSalary();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
