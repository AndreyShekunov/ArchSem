package homework3;

import java.awt.*;

public class Truck extends FreightCar{
    public Truck(String brand, String model, Color color, String bodyType, int numberOfWeels, String fuelType,
                 String transmissionType, double volumeEngine) {
        super(brand, model, color, bodyType, numberOfWeels, fuelType, transmissionType, volumeEngine);
    }

    @Override
    public void move() {
        System.out.println("Грузовик " + brand + " " + model + " движется");
    }

    @Override
    public void service() {
        System.out.println("Грузовик " + brand + " " + model + " на тех обслуживании");
    }

    @Override
    public void transmissionShift() {
        System.out.println("В грузовике " + brand + " " + model + " переключается коробка передач");
    }

    @Override
    public void turnOnHeadlights() {
        System.out.println("У грузовика " + brand + " " + model + " включились фары");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("У грузовика " + brand + " " + model + " включились дворники");
    }

    @Override
    public void turnOnFogLights() {
        System.out.println("У грузовика " + brand + " " + model + " включились противотуманные фары");
    }

    @Override
    public void cargoTransportation() {
        System.out.println("Грузовик " + brand + " " + model + " перевозит груз");
    }
}
