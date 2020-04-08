package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //composition
        House Myhouse = new House("Bismillah", new House_Windows(5, 10), new Doors(10, 20, new Locker("abc")),
                new Furniture("Chair", 4, 5));

        Myhouse.getDoor().OpenDoor();
        Myhouse.FurnitureCount();


    }
}
