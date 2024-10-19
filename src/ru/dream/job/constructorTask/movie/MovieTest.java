package ru.dream.job.constructorTask.movie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MovieTest {
    /**
     * тест который сначала проверит что конструктор по умолчанию пустой, затем после добавления параметров, проверяет
     * соответствие
     */
    @Test
    @DisplayName("Проверка конструктора по умолчанию")
    public void movieNoparametrTest() {
        Movie movie = new Movie();
        assertNull(movie.getTitle());
        assertNull(movie.getDirector());
        assertEquals(0, movie.getYearOfRelease());
        assertNull(movie.getRating());
        movie.setTitle("Интерсталер");
        movie.setDirector("Нолан");
        movie.setYearOfRelease(2014);
        movie.setRating("R");
        assertEquals("Интерсталер",movie.getTitle());
        assertEquals("Нолан", movie.getDirector());
        assertEquals(2014,movie.getYearOfRelease());
        assertEquals("R",movie.getRating());
    }

    /**
     * тест проверяет работу конструктор с заданными параметрами название фильма и режиссера, а так же проходит
     * проверка присвоенных значений
     */
    @Test
    @DisplayName("Проверка с параметрами Название и режиссер")
    public void movieParametrTwoTest() {
        Movie movie = new Movie("Интерсталер","Нолан");
        assertEquals("Интерсталер",movie.getTitle());
        assertEquals("Нолан", movie.getDirector());
        assertEquals(0,movie.getYearOfRelease());
        assertNull(movie.getRating());
    }

    /**
     * Проверка параметрализированного конструктора по созданию фильма, со всеми значениями
     */
    @Test
    @DisplayName("Проверка всех параметров")
    public void movieParametrTest() {
        Movie movie = new Movie("Интерсталер", "Нолан", 2014, "R");
        assertEquals("Интерсталер",movie.getTitle());
        assertEquals("Нолан", movie.getDirector());
        assertEquals(2014,movie.getYearOfRelease());
        assertEquals("R",movie.getRating());
    }
}
