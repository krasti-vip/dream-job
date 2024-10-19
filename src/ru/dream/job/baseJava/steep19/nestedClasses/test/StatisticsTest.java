package ru.dream.job.baseJava.steep19.nestedClasses.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.dream.job.baseJava.steep19.nestedClasses.ArrayProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatisticsTest {

    @Test
    @DisplayName("Тест вычисления среднего значения")
    void testAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;

        assertEquals(expectedAverage, ArrayProcessor.Statistics.average(array), 0.001);
    }

    @Test
    @DisplayName("Тест вычисления максимального значения")
    void testMax() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedMax = 5;

        assertEquals(expectedMax, ArrayProcessor.Statistics.max(array));
    }

    @Test
    @DisplayName("Тест вычисления минимального значения")
    void testMin() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedMin = 1;

        assertEquals(expectedMin, ArrayProcessor.Statistics.min(array));
    }

    @Test
    @DisplayName("Тест вычисления суммы")
    void testSum() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;

        assertEquals(expectedSum, ArrayProcessor.Statistics.sum(array));
    }

    @Test
    @DisplayName("Тест среднего значения с пустым массивом")
    void testAverageWithEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessor.Statistics.average(new int[]{});
        });

        assertEquals("Массив пустой", exception.getMessage());
    }

    @Test
    @DisplayName("Тест максимального значения с пустым массивом")
    void testMaxWithEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessor.Statistics.max(new int[]{});
        });

        assertEquals("Массив пустой", exception.getMessage());
    }

    @Test
    @DisplayName("Тест минимального значения с пустым массивом")
    void testMinWithEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessor.Statistics.min(new int[]{});
        });

        assertEquals("Массив пустой", exception.getMessage());
    }

    @Test
    @DisplayName("Тест суммы с пустым массивом")
    void testSumWithEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArrayProcessor.Statistics.sum(new int[]{});
        });

        assertEquals("Массив пустой", exception.getMessage());
    }
}
