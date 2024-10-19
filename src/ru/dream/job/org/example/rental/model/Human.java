package ru.dream.job.org.example.rental.model;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String passportId;

    private String email;

    private BankCard[] bankCards;

    private Product[] products;

    private Human() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Human human = new Human();

        public Builder setFirstName(String firstName) {
            human.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            human.setLastName(lastName);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            human.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder setPassportId(String passportId) {
            human.setPassportId(passportId);
            return this;
        }

        public Builder setEmail(String email) {
            human.setEmail(email);
            return this;
        }

        public Builder setBankCards(BankCard[] bankCards) {
            human.setBankCards(bankCards);
            return this;
        }

        public Builder setProducts(Product[] products) {
            human.setProducts(products);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BankCard[] getBankCards() {
        return bankCards;
    }

    public void setBankCards(BankCard[] bankCards) {
        this.bankCards = bankCards;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(passportId, human.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passportId);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passportId='" + passportId + '\'' +
                ", email='" + email + '\'' +
                ", bankCards=" + Arrays.toString(bankCards) +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
