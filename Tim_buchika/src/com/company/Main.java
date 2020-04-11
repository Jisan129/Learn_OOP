package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Random;

class Car {
    public int carNumber;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(int carNumber, boolean engine, int cylinder) {

        this.carNumber = carNumber;
        this.engine = engine;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void startEngine() {
        if (engine) {
            System.out.println("Engine Starts of " + carNumber);
        } else {
            System.out.println("" + carNumber + " has no Engines");
        }
    }

    public void brake() {
        if (engine) {
            System.out.println("Brake of car number " + carNumber);
        }
    }

    public void paint() {
        System.out.println("Paint Car");
    }
}

class Alien extends Car {
    public Alien(int carNumber, boolean engine, int cylinder) {
        super(carNumber, engine, cylinder);
    }

    public void music() {
        System.out.println("Start Alien music. Car number: " + carNumber);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Brake at Alien");
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Paint at Alien");
    }

}

class Toyota extends Car {
    public Toyota(int carNumber, boolean engine, int cylinder) {
        super(carNumber, engine, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine of Toyota: " + carNumber);
    }

    @Override
    public void brake() {
        System.out.println("Brake at Toyota ");
    }

    @Override
    public void paint() {
        super.paint();
    }
}

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(10, true, 2);
        car1.brake();
        car1.startEngine();
        System.out.println(car1.getClass().getSimpleName());
        Toyota car2 = new Toyota(10, true, 2);
        car2.brake();
        car2.startEngine();
        System.out.println(car2.getClass().getSimpleName());
        Alien car3 = new Alien(102, false, 3);
        car3.brake();
        car3.startEngine();
        System.out.println(car3.getClass().getSimpleName());
    }

}























