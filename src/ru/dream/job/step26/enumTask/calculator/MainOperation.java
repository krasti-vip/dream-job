package ru.dream.job.step26.enumTask.calculator;

import java.util.Scanner;

public class MainOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        int choice = scanner.nextInt();

        Operation operation = switch (choice) {
            case 1 -> Operation.ADD;
            case 2 -> Operation.SUBTRACT;
            case 3 -> Operation.MULTIPLY;
            case 4 -> Operation.DIVIDE;
            default -> null;
        };

        if (operation == null) {
                System.out.println("Ошибка: неверный выбор операции.");
                return;
        }

        try {
            double result = operation.apply(x, y);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
