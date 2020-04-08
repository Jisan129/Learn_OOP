package com.company;

public class Doors {
    private int numberOfDoors;
    private int size;
    private Locker locker;

    public Doors(int numberOfDoors, int size, Locker locker) {
        this.numberOfDoors = numberOfDoors;
        this.size = size;
        this.locker = locker;
    }

    private int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getSize() {
        return size;
    }


    public void OpenDoor() {

        System.out.println("Open door " + " " + getNumberOfDoors());
        locker.open("124");
    }


}
