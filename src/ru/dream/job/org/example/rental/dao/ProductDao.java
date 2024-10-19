package ru.dream.job.org.example.rental.dao;

import ru.dream.job.constructorTask.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    private List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product get(Product product) {
        return products.stream()
                .filter(prod -> prod.equals(product))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(Product product) {
        return products.stream()
                .filter(prod -> prod.equals(product))
                .findFirst()
                .map(prod -> {
                    int index = products.indexOf(prod);
                    products.set(index, product);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean delete(Product product) {
        return products.removeIf(prod -> prod.equals(product));
    }
}
