package ru.dream.job.step26.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingСharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи слово или фразу, а я разобью его на символы и на их количество: ");

        String sc = scanner.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();

        for(char ch : sc.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Количество символов в Вашем слове: ");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
