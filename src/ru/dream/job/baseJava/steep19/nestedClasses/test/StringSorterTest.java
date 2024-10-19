package ru.dream.job.baseJava.steep19.nestedClasses.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.dream.job.baseJava.steep19.nestedClasses.StringSorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringSorterTest {

    @Test
    @DisplayName("Тест сортировки строк по длине")
    void sortStringsByLengthTest() {
        StringSorter stringSorter = new StringSorter();

        String[] input = {"apple", "banana", "kiwi", "fig", "cherry"};
        String[] expected = {"fig", "kiwi", "apple", "banana", "cherry"};

        String[] sorted = stringSorter.sortStringsByLength(input);

        assertArrayEquals(expected, sorted);
    }

    @Test
    @DisplayName("Тест сортировки пустого массива")
    void sortEmptyArrayTest() {
        StringSorter stringSorter = new StringSorter();

        String[] input = {};
        String[] expected = {};

        String[] sorted = stringSorter.sortStringsByLength(input);

        assertArrayEquals(expected, sorted);
    }

    @Test
    @DisplayName("Тест сортировки массива с одним элементом")
    void sortSingleElementArrayTest() {
        StringSorter stringSorter = new StringSorter();

        String[] input = {"apple"};
        String[] expected = {"apple"};

        String[] sorted = stringSorter.sortStringsByLength(input);

        assertArrayEquals(expected, sorted);
    }

    @Test
    @DisplayName("Тест сортировки строк с одинаковой длиной")
    void sortStringsWithSameLengthTest() {
        StringSorter stringSorter = new StringSorter();

        String[] input = {"cat", "dog", "bat", "ant", "fox"};
        String[] expected = {"cat", "dog", "bat", "ant", "fox"};

        String[] sorted = stringSorter.sortStringsByLength(input);

        assertArrayEquals(expected, sorted);
    }

    @Test
    @DisplayName("Тест сортировки строк с разной длиной и одинаковыми длинами")
    void sortStringsWithMixedLengthsTest() {
        StringSorter stringSorter = new StringSorter();

        String[] input = {"a", "bb", "ccc", "dddd", "ee"};
        String[] expected = {"a", "bb", "ee", "ccc", "dddd"};

        String[] sorted = stringSorter.sortStringsByLength(input);

        assertArrayEquals(expected, sorted);
    }
}
