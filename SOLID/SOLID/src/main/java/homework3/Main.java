package homework3;

import java.awt.*;

/*
@startuml

 */
public class Main {
    public static void main(String[] args) {
        // Создание обычного автомобиля (класс RegularCar)
        RegularCar regularCar = new RegularCar("Лада", "ВАЗ-2114", Color.black, "Седан", 4,
                "Бензин", "Механическая", 1.2);

        regularCar.move();
        regularCar.service();
        regularCar.transmissionShift();
        regularCar.turnOnHeadlights();
        regularCar.turnOnWipers();

        System.out.println();

        // Создание подметально-уборочной машины Sweeper ММК-1000
        SweeperCar sweeperCar = new SweeperCar("Sweeper", "ММК-1000", Color.yellow, "Большой",
                4, "Дизель", "Гидростатическая", 5.0);

        sweeperCar.move();
        sweeperCar.service();
        sweeperCar.transmissionShift();
        sweeperCar.turnOnHeadlights();
        sweeperCar.turnOnWipers();
        sweeperCar.sweepStreet();

        System.out.println();

        // Создание грузовика
        Truck truck = new Truck("КамАЗ", "65115", Color.red, "Ковшевой", 4,
                "Дизель", "Гидростатическая", 6.7);

        truck.move();
        truck.service();
        truck.transmissionShift();
        truck.turnOnFogLights();
        truck.cargoTransportation();

        System.out.println();

        // Создание обычного автомобиля с учетом интерфейса GasStation
        RegularCar gasCar = new RegularCar("Волга", "ГАЗ-2410", Color.white, "Седан",
                4, "Бензин", "Механическая", 2.5);

        gasCar.move();
        gasCar.refueling();
        gasCar.wipingWindshield();
        gasCar.wipingHeadlights();
        gasCar.wipingMirrors();

    }
}
