package com.company;

public class DietBurger extends HamBurger {

    public DietBurger(int meatSize, int price) {
        super("Rye", meatSize, price);
    }

    @Override
    public String getBreadType() {
        return super.getBreadType();
    }

    @Override
    public int getMeatSize() {
        return super.getMeatSize();
    }

    @Override
    public void additionalItem(boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean drinks) {
        super.additionalItem(lettuce, tomato, carrot, cheese);
        if (drinks) {
            price += 20;
        }

    }

    @Override
    public void charge() {
        super.charge();
    }

    @Override
    public void description() {
        super.description();
    }
}
