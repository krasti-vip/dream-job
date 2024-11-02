package ru.dream.job.step26.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskQueue {

    static LinkedList<String> taskQueue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Добро пожаловать в очередь задач!");

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу в очередь");
            System.out.println("2. Взять задачу из очереди");
            System.out.println("3. Просмотреть текущую очередь задач");
            System.out.println("4. Выйти");
            System.out.print("Выберите пункт меню: ");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                addTask(scanner);
            } else if (choice.equals("2")) {
                takeTask();
            } else if (choice.equals("3")) {
                viewTasks();
            } else if (choice.equals("4")) {
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("Ошибка: выберите правильный пункт меню.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Введите задачу для добавления в очередь: ");
        String task = scanner.nextLine().trim();

        if (!task.isEmpty()) {
            taskQueue.add(task);
            System.out.println("Задача добавлена в очередь.");
        } else {
            System.out.println("Ошибка: задача не может быть пустой.");
        }
    }

    private static void takeTask() {
        if (!taskQueue.isEmpty()) {
            String task = taskQueue.removeFirst();
            System.out.println("Взята задача: " + task);
        } else {
            System.out.println("Очередь пуста, нет задач для выполнения.");
        }
    }

    private static void viewTasks() {
        if (!taskQueue.isEmpty()) {
            System.out.println("Текущая очередь задач: " + taskQueue);
        } else {
            System.out.println("Очередь пуста.");
        }
    }
}
