package ru.dream.job.constructorTask.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BookTest {
    /**
     * тест который проверяет что конструктор по умолчанию пустой, затем присваиваем значения и проверяем их
     */
    @Test
    public void bookNoparametersTest() {
        Book book = new Book();
        assertNull(book.getTitle());
        assertNull(book.getAuthor());
        assertEquals(0, book.getPages());
        book.setTitle("Три мушкетера");
        book.setAuthor("Дюма");
        book.setPages(265);
        assertEquals("Три мушкетера", book.getTitle());
        assertEquals("Дюма", book.getAuthor());
        assertEquals(265, book.getPages());
    }

    /**
     * тест проверяет что параметрализированный конструктор работает корректно и значения присваиваются
     */
    @Test
    public void bookParametrsTest() {
        Book book = new Book("Три мушкетера", "Дюма", 265);
        assertEquals("Три мушкетера", book.getTitle());
        assertEquals("Дюма", book.getAuthor());
        assertEquals(265, book.getPages());
    }
}
