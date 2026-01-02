package by.sorokatech.task1.entity;

public class Motorcycle {

    private String brand;
    private int engineVolume;
    private boolean hasSidecar;

    public Motorcycle(String brand, int engineVolume, boolean hasSidecar) {
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.hasSidecar = hasSidecar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public void printInfo() {
        System.out.println("Мотоцикл");
        System.out.println("Марка: " + brand);
        System.out.println("Объем двигателя: " + engineVolume + " см³");
        System.out.println("Коляска: " + (hasSidecar ? "Есть" : "Нет"));
    }
}
