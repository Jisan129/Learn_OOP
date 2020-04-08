package com.company;

public class House {

    private String houseName;
    private House_Windows windows;
    private Doors door;
    private Furniture furniture;

    public House(String houseName, House_Windows windows, Doors door, Furniture furniture) {
        this.houseName = houseName;
        this.windows = windows;
        this.door = door;
        this.furniture = furniture;
    }

    public String getHouseName() {
        return houseName;
    }

    private House_Windows getWindows() {
        return windows;
    }

    public Doors getDoor() {
        return door;
    }

    private Furniture getFurniture() {
        return furniture;
    }

    public void FurnitureCount() {
        getFurniture().descriveFurniture();

    }
}
