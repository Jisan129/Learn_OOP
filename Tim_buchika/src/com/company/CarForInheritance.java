package com.company;

public class CarForInheritance extends Vehicle {
    String model;


    public CarForInheritance(int speed, String model) {
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
