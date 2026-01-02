package by.sorokatech.task1.entity;

public class Airplane {

    private String model;
    private int passengerCapacity;
    private double flightRange;

    public Airplane(String model, int passengerCapacity, double flightRange) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.flightRange = flightRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    public void printInfo() {
        System.out.println("Самолет");
        System.out.println("Модель: " + model);
        System.out.println("Вместимость: " + passengerCapacity + " пассажиров");
        System.out.println("Дальность полета: " + flightRange + " км");
    }

}
