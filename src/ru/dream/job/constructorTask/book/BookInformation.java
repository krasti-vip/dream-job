package ru.dream.job.constructorTask.book;

public class BookInformation {

    public static void main(String[] args) {
    // создаем для проверки книгу, а так же оставляем пустым конструктор по умолчанию, выводим на консоль для проверки
        Book book1 = new Book();
        Book book2 = new Book("Три мушкетера", "Дюма", 265);

        System.out.println(book1);
        System.out.println(book2);
    }
}
