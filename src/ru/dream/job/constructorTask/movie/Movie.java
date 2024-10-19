package ru.dream.job.constructorTask.movie;

/**
 * Класс "Фильм" с перегрузкой конструкторов:
 *
 * Создайте класс Movie с полями: название фильма, режиссер, год выпуска, рейтинг.
 * Реализуйте несколько конструкторов: один без параметров, второй с названием и режиссером, третий с полным набором параметров.
 * Напишите метод для вывода полной информации о фильме, протестируйте все варианты конструкторов.
 */
public class Movie {

    private String title;
    private String director;
    private int yearOfRelease;
    private String rating;

    /**
     * Создаем конструктор по умолчанию, затем параметрализированный
     */
    public Movie(){}

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public Movie(String title, String director, int yearOfRelease, String rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rating='" + rating + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
