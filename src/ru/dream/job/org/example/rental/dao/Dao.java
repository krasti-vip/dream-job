package ru.dream.job.org.example.rental.dao;

public interface Dao<T> {

    void save(T obj);

    T get(T obj);

    boolean update(T obj);

    boolean delete(T obj);
}
