package ru.dream.job.step26.hashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentsAndGrades {

    static Scanner scanner = new Scanner(System.in);
    static Map<String, Double> students = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args) {
        initializeStudents();

        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addStudent();
                case "2" -> updateStudentGrade();
                case "3" -> getStudentGrade();
                case "4" -> listAllStudents();
                case "0" -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                default -> System.out.println("Ошибка: неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void initializeStudents() {
        students.put("Белов", 5.0);
        students.put("Сидоров", 3.0);
        students.put("Огорцов", 4.0);
    }

    private static void displayMenu() {
        System.out.println("\nДобро пожаловать в программу хранения оценок студентов!");
        System.out.println("Сделайте свой выбор:");
        System.out.println("1 - добавить нового студента");
        System.out.println("2 - обновить оценку существующего студента");
        System.out.println("3 - получить оценку студента по имени");
        System.out.println("4 - просмотреть список всех студентов и их оценки");
        System.out.println("0 - выйти из программы");
    }

    private static void addStudent() {
        System.out.print("Введите имя студента: ");
        String studentName = scanner.nextLine();

        if (students.containsKey(studentName)) {
            System.out.println("Ошибка: Студент " + studentName + " уже существует в базе.");
        } else {
            System.out.print("Введите оценку для " + studentName + ": ");
            Double score = readScore();
            students.put(studentName, score);
            System.out.println("Вы сохранили в базу " + studentName + " с оценкой " + score);
        }
    }

    private static void updateStudentGrade() {
        System.out.print("Введите имя студента для поиска: ");
        String nameStudent = scanner.nextLine();

        if (students.containsKey(nameStudent)) {
            System.out.print("Введите новую оценку для " + nameStudent + ": ");
            Double score = readScore();
            students.put(nameStudent, score);
            System.out.println("Оценка " + nameStudent + " обновлена на " + score);
        } else {
            System.out.println("Студента с именем " + nameStudent + " нет в базе.");
        }
    }

    private static void getStudentGrade() {
        System.out.print("Введите имя студента: ");
        String studentName = scanner.nextLine();
        Double score = students.get(studentName);

        if (score != null) {
            System.out.println("Оценка студента " + studentName + " - " + score);
        } else {
            System.out.println("Студента с именем " + studentName + " в базе нет.");
        }
    }

    private static void listAllStudents() {
        System.out.println("Список всех студентов и их оценок:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println("У студента " + entry.getKey() + " оценка: " + entry.getValue());
        }
    }

    private static Double readScore() {
        while (true) {
            if (scanner.hasNextDouble()) {
                double score = scanner.nextDouble();
                scanner.nextLine(); // Очистка буфера
                return score;
            } else {
                System.out.println("Ошибка! Введите числовую оценку.");
                scanner.next();
            }
        }
    }
}
