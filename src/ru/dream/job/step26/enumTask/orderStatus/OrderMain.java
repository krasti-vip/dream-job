package ru.dream.job.step26.enumTask.orderStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderMain {

    private static final Map<Integer, Order> orders = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем несколько заказов для примера
        orders.put(1, new Order(1));
        orders.put(2, new Order(2));
        orders.put(3, new Order(3));

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Просмотреть статус заказа по номеру");
            System.out.println("2 - Изменить статус заказа по номеру");
            System.out.println("3 - Просмотреть все заказы и их статусы");
            System.out.println("0 - Выйти");

            int choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Введите номер заказа: ");
                int orderId = scanner.nextInt();
                Order selectedOrder = orders.get(orderId);

                if (selectedOrder != null) {
                    System.out.println("Статус заказа №" + orderId + ": " + selectedOrder.getStatus());

                    if (choice == 2) {
                        System.out.println("\nВыберите новый статус:");
                        System.out.println("1 - НОВЫЙ");
                        System.out.println("2 - В ОБРАБОТКЕ");
                        System.out.println("3 - ОТПРАВЛЕН");
                        System.out.println("4 - ДОСТАВЛЕН");
                        System.out.println("0 - Отмена");

                        int statusChoice = scanner.nextInt();

                        switch (statusChoice) {
                            case 1 -> selectedOrder.setStatus(OrderStatus.НОВЫЙ);
                            case 2 -> selectedOrder.setStatus(OrderStatus.В_ОБРАБОТКЕ);
                            case 3 -> selectedOrder.setStatus(OrderStatus.ОТПРАВЛЕН);
                            case 4 -> selectedOrder.setStatus(OrderStatus.ДОСТАВЛЕН);
                            case 0 -> System.out.println("Изменение статуса отменено.");
                            default -> System.out.println("Неверный ввод! Пожалуйста, выберите от 0 до 4.");
                        }
                    }
                } else {
                    System.out.println("Заказ с номером " + orderId + " не найден.");
                }
            } else if (choice == 3) {
                System.out.println("Список всех заказов и их статусов:");
                for (Order order : orders.values()) {
                    System.out.println("Заказ №" + order.getOrderId() + ": " + order.getStatus());
                }
            } else if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Неверный ввод! Пожалуйста, выберите от 0 до 3.");
            }
        }
    }
}
