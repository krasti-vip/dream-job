package ru.dream.job.baseJava.steep19.nestedClasses;

import java.util.Arrays;

public class ArrayProcessor {

    public static class Statistics {

        public static double average(int[] array) {

            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Массив пустой");
            }
            int sum = Arrays.stream(array).sum();

            return (double) sum / array.length;
        }

        public static int max(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Массив пустой");
            }

            return Arrays.stream(array).max().getAsInt();
        }

        public static int min(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Массив пустой");
            }

            return Arrays.stream(array).min().getAsInt();
        }

        public static int sum(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Массив пустой");
            }

            return Arrays.stream(array).sum();
        }
    }
}
