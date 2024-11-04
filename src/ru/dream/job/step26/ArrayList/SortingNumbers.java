package ru.dream.job.step26.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        /**
         * ВНИМАНИЕ!!! нет проверок на введение стринга или дабла!!!
         */
        System.out.println("Введите количество чисел которые вы хотите сохранить для сортировке: ");
        int count = scanner.nextInt();

        System.out.println("Введите " + count + " целых чисел:");
        for (int i = 0; i < count; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        ArrayList<Integer> ascendingOrder = new ArrayList<>(numbers);
        Collections.sort(ascendingOrder);
        System.out.println("Числа в порядке возрастания: " + ascendingOrder);

        ArrayList<Integer> descendingOrder = new ArrayList<>(numbers);
        descendingOrder.sort(Collections.reverseOrder());
        System.out.println("Числа в порядке убывания: " + descendingOrder);
    }
}
