package ru.dream.job.taskInterface.group2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterTest {

    @Test
    @DisplayName("Фильтрация по заданной длине")
    public void filterLengthTest() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        Filter lengthFilter = new LengthFilter(5);
        List<String> filteredStrings = LengthFilter.filterStrings(strings, lengthFilter);
        List<String> expected = Arrays.asList("banana", "cherry");
        Assertions.assertEquals(expected, filteredStrings, "Фильтрация строк не прошла проверку");
    }

    @Test
    @DisplayName("Фильтрация пустого листа")
    public void filterEmptyListTest() {
        List<String> strings = Arrays.asList();
        Filter lengthFilter = new LengthFilter(5);
        List<String> filteredStrings = LengthFilter.filterStrings(strings, lengthFilter);
        List<String> expected = Arrays.asList();
        Assertions.assertEquals(expected, filteredStrings, "Фильтрация пустого списка строк не прошла проверку");
    }

    @Test
    @DisplayName("Фильтрация без совпадений")
    public void filterNoMatchingTest() {
        List<String> strings = Arrays.asList("cat", "dog", "bat");
        Filter lengthFilter = new LengthFilter(5);
        List<String> filteredStrings = LengthFilter.filterStrings(strings, lengthFilter);
        List<String> expected = Arrays.asList();
        Assertions.assertEquals(expected, filteredStrings, "Фильтрация строк с отсутствующими совпадениями не прошла проверку");
    }

    @Test
    @DisplayName("Фильтрация всех елементов в списке")
    public void filterAllMatchingTest() {
        List<String> strings = Arrays.asList("elephant", "giraffe", "hippopotamus");
        Filter lengthFilter = new LengthFilter(5);
        List<String> filteredStrings = LengthFilter.filterStrings(strings, lengthFilter);
        List<String> expected = Arrays.asList("elephant", "giraffe", "hippopotamus");
        Assertions.assertEquals(expected, filteredStrings, "Фильтрация строк с совпадающими значениями не прошла проверку");
    }
}
