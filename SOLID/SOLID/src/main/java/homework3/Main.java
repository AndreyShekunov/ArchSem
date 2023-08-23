package homework3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Создание обычного автомобиля (класс RegularCar)
        RegularCar regularCar = new RegularCar("ВАЗ", "2114", Color.black, "Седан", 4,
                "Бензин", "Механическая", 1.2);

        regularCar.move();
        regularCar.service();
        regularCar.transmissionShift();
        regularCar.turnOnHeadlights();
        regularCar.turnOnWipers();
    }
}
