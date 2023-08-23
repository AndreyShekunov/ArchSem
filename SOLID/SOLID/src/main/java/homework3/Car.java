package homework3;

import java.awt.*;

public abstract class Car {
    protected String brand;
    protected String model;
    protected Color color;
    protected String bodyType;
    protected int numberOfWeels;
    protected String fuelType;
    protected String transmissionType;
    protected double volumeEngine;

    // Конструктор

    public Car(String brand, String model, Color color, String bodyType, int numberOfWeels,
               String fuelType, String transmissionType, double volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWeels = numberOfWeels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.volumeEngine = volumeEngine;
    }

    // метод движения

    public abstract void move();

    // метод сервисного обслуживания

    public abstract void service();

    // метод переключения коробки передач

    public abstract void transmissionShift();

    // метод включения фар

    public abstract void turnOnHeadlights();

    // метод включения дворников

    public abstract void turnOnWipers();

}
