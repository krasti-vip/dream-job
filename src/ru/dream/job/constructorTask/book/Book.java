package ru.dream.job.constructorTask.book;

/**
 * Создание класса "Книга":
 *
 * Создайте класс Book, который содержит поля: название книги, автор, количество страниц.
 * Реализуйте конструктор по умолчанию, который присваивает значения по умолчанию.
 * Реализуйте параметризованный конструктор, принимающий все поля в качестве аргументов.
 * Напишите метод для вывода информации о книге и протестируйте оба конструктора.
 */
public class Book {

    private String title;
    private String author;
    private int pages;

    // создаем пустой конструктор
    public Book() {}
    // конструктор с параметрализированный конструктор где есть название книги автор и количество страниц
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // аннотация которая позволяет вывести информацию о конкретной книге
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
