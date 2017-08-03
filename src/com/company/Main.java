package com.company;

public class Main {

    //реализуем работу лифтов в доме (на один подъезд 3 лифта)

    public static void main(String[] args) {

        Elevator elevator1 = new Elevator(1, 1);
        Elevator elevator2 = new Elevator(1, 2);
        Elevator elevator3 = new Elevator(1, 3);

        House house = new House(10, elevator1, elevator2, elevator3);
        System.out.println(elevator1.getInfo());
        System.out.println(house.getInfo());



    }
}
