package ru.dream.job.constructorTask.movie;

public class MovieInfo {

    public static void main(String[] args) {
/**
 * Проверяем работу создания филтма, а затем вывода информации на консоль
 */
        Movie movie = new Movie("Интерсталер", "Нолан", 2014, "R");

        System.out.println(movie);
    }
}
