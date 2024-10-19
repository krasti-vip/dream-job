package ru.dream.job.baseJava.steep19.nestedClasses;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {

    public String[] sortStringsByLength(String[] array) {
        class sortStringsByLengthComporator implements Comparator <String> {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        }
        Arrays.sort(array, new sortStringsByLengthComporator());

        return array;
    }
}
