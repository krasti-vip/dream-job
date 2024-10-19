package ru.dream.job.org.example.rental.model;
import java.util.Objects;

public class Product {
private String name;
private double price;
private boolean isRented; //статус, в аренде или нет

public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.isRented = false;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isRented() {
        return isRented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equalsIgnoreCase(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", isRented=" + isRented +
            '}';
    }
}
