package com.company;

import java.util.Arrays;

/**
 * Created by Brainacad3 on 03.08.2017.
 */
public class ElevatorService {

    private final House house;

    public ElevatorService(House house) {
        this.house = house;
    }

    public Elevator call(int floor){

        int min = house.getTotalFloors();
        Elevator elevator = null;

        for (Elevator e : house.getElevators()) {
            int distance = Math.abs(e.getFloor() - floor);//abs - убираем знак от этажа, нам неважно +2 этажа или -2 этажа на котром мы вызываем лифт
            if (min > distance) {
                min = distance;
                elevator = e;
            }
        }
        return elevator;
    }

    public int moveTo(Elevator elevator, int floor){

        if (floor < 1 || floor > house.getTotalFloors()){
            return -1;
        }

        elevator.setFloor(floor);
        return  floor;
    }

}
