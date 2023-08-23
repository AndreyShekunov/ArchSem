package homework3;

import java.awt.*;

// абстрактный класс Подметально-уборочная машина

public abstract class Sweeper extends Car{

    // Конструктор

    public Sweeper(String brand, String model, Color color, String bodyType, int numberOfWeels, String fuelType,
                   String transmissionType, double volumeEngine) {
        super(brand, model, color, bodyType, numberOfWeels, fuelType, transmissionType, volumeEngine);
    }

    // метод подметать улицу

    public abstract void sweepStreet();
}
