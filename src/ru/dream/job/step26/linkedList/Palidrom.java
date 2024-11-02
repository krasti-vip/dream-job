package ru.dream.job.step26.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Palidrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");

        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zа-я0-9]", "");

        if (isPalindrome(input)) {
            System.out.println("Введенная строка является палиндромом.");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        LinkedList<Character> charList = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            charList.add(ch);
        }

        while (charList.size() > 1) {
            if (!charList.removeFirst().equals(charList.removeLast())) {
                return false;
            }
        }
        return true;
    }
}
