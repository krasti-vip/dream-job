package ru.dream.job.step26.linkedList;

import java.util.LinkedList;
import java.util.List;

public class MergeLists {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(List.of("а", "б", "в"));
        LinkedList<String> list2 = new LinkedList<>(List.of("1", "2", "3", "4", "5"));

        LinkedList<String> mergedList = mergeLists(list1, list2);
        System.out.println("Объединенный список: " + mergedList);
    }

    public static LinkedList<String> mergeLists(LinkedList<String> list1, LinkedList<String> list2) {
        LinkedList<String> result = new LinkedList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
