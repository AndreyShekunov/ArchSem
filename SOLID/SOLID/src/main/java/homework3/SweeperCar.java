package homework3;

import java.awt.*;

public class SweeperCar extends Sweeper{
    public SweeperCar(String brand, String model, Color color, String bodyType, int numberOfWeels, String fuelType, String transmissionType, double volumeEngine) {
        super(brand, model, color, bodyType, numberOfWeels, fuelType, transmissionType, volumeEngine);
    }

    @Override
    public void move() {
        System.out.println("Подметально-уборочная машина " + brand + " " + model + " движется");
    }

    @Override
    public void service() {
        System.out.println("Подметально-уборочная машина " + brand + " " + model + " на тех обслуживании");
    }

    @Override
    public void transmissionShift() {
        System.out.println("В подметально-уборочной машине " + brand + " " + model + " переключается коробка передач");
    }

    @Override
    public void turnOnHeadlights() {
        System.out.println("У подметально-уборочной машины " + brand + " " + model + " включились фары");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("У подметально-уборочной машины " + brand + " " + model + " включились дворники");
    }

    @Override
    public void sweepStreet() {
        System.out.println("Подметально-уборочная машина " + brand + " " + model + " подметает улицу");
    }

    @Override
    public void refueling() {

    }

    @Override
    public void wipingWindshield() {

    }

    @Override
    public void wipingHeadlights() {

    }

    @Override
    public void wipingMirrors() {

    }
}
