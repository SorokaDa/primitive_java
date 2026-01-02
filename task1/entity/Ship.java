package by.sorokatech.task1.entity;

public class Ship {

    private String name;
    private String type;
    private int crewCount;

    public Ship(String name, String type, int crewCount) {
        this.name = name;
        this.type = type;
        this.crewCount = crewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCrewCount() {
        return crewCount;
    }

    public void setCrewCount(int crewCount) {
        this.crewCount = crewCount;
    }

    public void printInfo() {
        System.out.println("Корабль");
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Экипаж: " + crewCount + " человек");
    }

}
