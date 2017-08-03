package com.company;

/**
 * Created by Brainacad3 on 03.08.2017.
 */
public class Elevator {
    //поля должныбыть закрыты
    private int floor;
    private int id;

    //методы открыты

    //конструктор без параметров
    public Elevator() {
    }

    //конструктор с параметрами
    public Elevator(int floor, int id) {
        this.floor = floor;
        this.id = id;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getInfo() {
        //String.format("", ) по принципу System.out.println(), но возвращает строку
        return "Elevator: " + id + ", Floor: " + floor;
    }
}
