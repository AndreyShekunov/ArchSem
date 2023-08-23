package homework3;

import java.awt.*;

public abstract class FreightCar extends Car{

    // Конструктор

    public FreightCar(String brand, String model, Color color, String bodyType, int numberOfWeels, String fuelType,
                      String transmissionType, double volumeEngine) {
        super(brand, model, color, bodyType, numberOfWeels, fuelType, transmissionType, volumeEngine);
    }


    // метод включения противотуманных фар

        public abstract void turnOnFogLights();

    // метод перевозка груза

        public abstract void cargoTransportation();
}
