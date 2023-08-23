package homework3;

// класс обычного автомобиля

import java.awt.*;

public class RegularCar extends Car{
    public RegularCar(String brand, String model, Color color, String bodyType, int numberOfWeels,
                      String fuelType, String transmissionType, double volumeEngine) {
        super(brand, model, color, bodyType, numberOfWeels, fuelType, transmissionType, volumeEngine);
    }

    @Override
    public void move() {
        System.out.println("Автомобиль " + brand + " " + model + " движется");
    }

    @Override
    public void service() {
        System.out.println("Автомобиль " + brand + " " + model + " на тех обслуживании");
    }

    @Override
    public void transmissionShift() {
        System.out.println("В автомобиле " + brand + " " + model + " переключается коробка передач");
    }

    @Override
    public void turnOnHeadlights() {
        System.out.println("У автомобиля " + brand + " " + model + " включились фары");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("У автомобиля " + brand + " " + model + " включились дворники");
    }

    @Override
    public void refueling() {
        System.out.println("Автомобиль " + brand + " " + model + " заправляется");
    }

    @Override
    public void wipingWindshield() {
        System.out.println("У автомобиля " + brand + " " + model + " выполняется протирка лобового стекла");
    }

    @Override
    public void wipingHeadlights() {
        System.out.println("У автомобиля " + brand + " " + model + " выполняется протирка фар");
    }

    @Override
    public void wipingMirrors() {
        System.out.println("У автомобиля " + brand + " " + model + " выполняется протирка зеркал");
    }
}
