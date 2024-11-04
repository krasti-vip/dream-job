package ru.dream.job.step26.hashMap;

import java.util.HashMap;
import java.util.Map;

public class NumberCounter {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 3, 1, 6, 2, 3};

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        System.out.println("Числа, повторяющиеся более одного раза: ");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
            }
        }
    }
}
