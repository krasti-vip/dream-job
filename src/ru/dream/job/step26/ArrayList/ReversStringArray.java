package ru.dream.job.step26.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversStringArray {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Необходимо ввести 4 строки для добавления в массив, ");
        System.out.println("введите 1 строку для добавления в массив: ");
        String one = scanner.nextLine();
        System.out.println("Введите 2 строку для добавления в массив: ");
        String two = scanner.nextLine();
        System.out.println("Введите 3 строку для добавления в массив: ");
        String three = scanner.nextLine();
        System.out.println("Введите 4 строку для добавления в массив: ");
        String four = scanner.nextLine();

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        System.out.println("Вы ввели 4 строки в этом порядке: " + list);

        System.out.println("Хотите вывести массив в обратном порядке? да или нет?");

        while (true) {
            String sc = scanner.nextLine();
            if(sc.equalsIgnoreCase("да")) {

                System.out.println("Строки в обратном порядке:");
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }
            } else if (sc.equalsIgnoreCase("нет")) {
                System.out.println("Досвидания!");
                break;
            } else {
                System.out.println("неверный ввод, введите только да или нет!");
            }
        }
    }
}
