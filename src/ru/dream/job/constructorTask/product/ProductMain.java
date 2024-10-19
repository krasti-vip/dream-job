package ru.dream.job.constructorTask.product;

public class ProductMain {

    public static void main(String[] args) {
        // Создание товара по умолчанию
        Product product1 = new Product();
        product1.displayInfo();
        System.out.println();

        // Создание товара с заданной ценой и количеством
        Product product2 = new Product("Телевизор", 30000.0, 10);
        product2.displayInfo();
        System.out.println();

        // Изменение количества товара на складе
        product2.changeStock(5);  // Увеличение на 5
        product2.changeStock(-12);  // Уменьшение на 12
        product2.changeStock(-3);  // Уменьшение на 3 (успешно)
        // проверка изъятия большего количества товара чем есть на складе
        product2.changeStock(-3);  // Уменьшение на 3 (успешно)
        System.out.println();

        // Создание еще одного товара
        Product product3 = new Product("Ноутбук", 50000.0, 20);
        product3.displayInfo();
        product3.changeStock(-5);  // Уменьшение на 5
    }
}
