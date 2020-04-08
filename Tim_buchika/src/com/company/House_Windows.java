package com.company;

public class House_Windows {

    private int numberOfWindows;
    private int size;

    public House_Windows(int numberOfWindows, int size) {
        this.numberOfWindows = numberOfWindows;
        this.size = size;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getSize() {
        return size;
    }

    public void openWindows() {
        System.out.println("Open windows " + numberOfWindows);
    }

}
