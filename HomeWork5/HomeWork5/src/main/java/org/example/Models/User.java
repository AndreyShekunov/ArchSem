package org.example.Models;

import org.example.Services.BasketRepository;

// Класс пользователя

public class User {
    private static int id =0;
    private String firstName;          // Имя
    private String lastName;           // Фамилия
    private long cardNumber;           // Номер карты
    private int passwordHash;          // хэш пароля
    private BasketRepository basket;   // корзина

    // Конструктор

    public User(String firstName, String lastName, long cardNumber, int passwordHash) {
        this.id++;
        this.basket = new BasketRepository();
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.passwordHash = passwordHash;
    }

    public static int getId() {
        return id;
    }

    public BasketRepository getBasket(){
        return basket;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPasswordHash() {
        return passwordHash;
    }

    @Override
    public String toString() {
        return "Models.User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber=" + cardNumber +
                ", passwordHash=" + passwordHash +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User client = (User) o;
        return this.equals(client);
    }

    public boolean equals(User client) {
        return id == client.id && passwordHash == client.passwordHash && cardNumber == client.cardNumber
                && firstName.equals(client.firstName) && lastName.equals(client.lastName);
    }
}
