package com.company;

/**
 * Created by Brainacad3 on 03.08.2017.
 */
public class House {

    //поля должныбыть закрыты
    private int totalFloors;
    private Elevator[] elevators;

    //методы открыты

    public House() {
    }

    //пeредаем не массив Elevator[], а неизвестное количество аргументов
    public House(int totalFloors, Elevator... elevators) {
        this.totalFloors = totalFloors;
        this.elevators = elevators;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public Elevator[] getElevators() {
        return elevators;
    }

    //пeредаем не массив Elevator[], а неизвестное количество аргументов
    public void setElevators(Elevator... elevators) {
        this.elevators = elevators;
    }

    public String getInfo() {
        String info = "\nToal floors: " + totalFloors + "\n";
        for (Elevator elevator : elevators) {
            info += "Elevator: "+ elevator.getInfo() + "\n";
        }
        return info;
    }
}
