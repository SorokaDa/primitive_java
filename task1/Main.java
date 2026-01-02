package by.sorokatech.task1;

import by.sorokatech.task1.entity.Car;
import by.sorokatech.task1.entity.Motorcycle;
import by.sorokatech.task1.entity.Airplane;
import by.sorokatech.task1.entity.Ship;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "E34", 1993, 300);
        Motorcycle motorcycle = new Motorcycle("Yamaha", 600, false);
        Airplane airplane = new Airplane("Boeing 737", 180, 5600);
        Ship ship = new Ship("Titanic", "Пассажирский", 900);

        car.printInfo();
        motorcycle.printInfo();
        airplane.printInfo();
        ship.printInfo();
    }
}