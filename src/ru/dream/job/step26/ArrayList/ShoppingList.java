package ru.dream.job.step26.ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingList {

     private static final ArrayList<String> shoppingList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар по названию");
            System.out.println("3. Просмотреть список покупок");
            System.out.println("4. Выйти");
            System.out.print("Выберите опцию: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addItem(scanner);
                    case 2 -> removeItemByName(scanner);
                    case 3 -> viewShoppingList();
                    case 4-> exit = true;
                    default -> System.out.println("Ошибка: выберите номер от 1 до 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите номер.");
                scanner.nextLine();
            }
        }
        System.out.println("Программа завершена.");
        scanner.close();
    }

    private static void addItem(Scanner scanner) {

        System.out.print("Введите название товара: ");
        String item = scanner.nextLine().trim();

        if (!item.isEmpty() && !item.matches("\\d+")) {
            shoppingList.add(item);
            System.out.println("Товар добавлен.");

        } else {
            System.out.println("Ошибка: название товара не может быть пустым.");
        }
    }

    private static void removeItemByName(Scanner scanner) {

        System.out.print("Введите название товара для удаления: ");
        String item = scanner.nextLine().trim();

        if (shoppingList.remove(item)) {
            System.out.println("Товар \"" + item + "\" удален.");

        } else {
            System.out.println("Ошибка: товар не найден.");
        }
    }

    private static void viewShoppingList() {

        if (shoppingList.isEmpty()) {
            System.out.println("Список покупок пуст.");

        } else {
            System.out.println("\nТекущий список покупок:");

            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println(i + ": " + shoppingList.get(i));
            }
        }
    }
}

