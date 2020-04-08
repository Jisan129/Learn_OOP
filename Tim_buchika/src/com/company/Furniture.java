package com.company;

public class Furniture {
    private String name;
    private int size;
    private int numbers;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getNumbers() {
        return numbers;
    }

    public Furniture(String name, int size, int numbers) {
        this.name = name;
        this.size = size;
        this.numbers = numbers;
    }

    public void descriveFurniture() {
        System.out.println("How many furniture: " + numbers + " " + name + " ");
    }

}
