package com.company;

public class Vehicle {
    int speed;


    public Vehicle(int speed) {
        this.speed = speed;

    }

    public void move() {
        System.out.println("Vehicle is Moving");
    }

    public void accerlate(int accelaration) {
        System.out.println("Speed increased: " + speed);
    }

    public void brake(int decreasing) {
        System.out.println("Speed decreased " + decreasing);
    }

}
