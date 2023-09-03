package org.example.Models;

public abstract class Product {
    private static int id = 0;
    private String name;
    private String description;
    private int price;

    public Product(String name, String description, int price) {
        this.id++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getId(){
        return id;
    }
}
