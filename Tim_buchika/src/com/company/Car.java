package com.company;

public class Car extends Vehicle {
    String model;


    public Car(int speed, String model) {
        super(speed);
        this.model = model;
    }

    public void steering() {
        System.out.println("Steering is Called");
    }

    @Override
    public void move() {
        super.move();

    }

    @Override
    public void accerlate(int accelaration) {
        super.accerlate(accelaration);
        speed = accelaration + speed;
        System.out.println("New Speed " + speed);
    }

    @Override
    public void brake(int decreasing) {
        super.brake(decreasing);
        speed = speed - decreasing;
        System.out.println("New speed " + speed);
    }
}
