package com.company;



public class HamBurger {
    private String breadType;
    private int meatSize;
    public int price;

    public HamBurger(String breadType, int meatSize, int price) {
        this.breadType = breadType;
        this.meatSize = meatSize;
        this.price = 100;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setPrice(int price) {
        this.price = 100;
    }

    public int getMeatSize() {
        return meatSize;
    }

    public void additionalItem(boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        if (lettuce) {
            price += 20;
        }
        if (tomato) {
            price += 20;
        }
        if (carrot) {
            price += 20;
        }
        if (cheese) {
            price += 20;
        }
    }


    public void charge() {
        System.out.println("Price: " + price);
    }

    public void description() {
        System.out.println(getClass().getSimpleName());
        System.out.println("BreadType: " + breadType + " Size: " + meatSize + " Charge: " + price);
    }
}
