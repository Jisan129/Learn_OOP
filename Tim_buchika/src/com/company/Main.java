package com.company;


public class Main {

    public static void main(String[] args) {
        HamBurger burger = new HamBurger("Duplex", 10, 100);
        burger.additionalItem(true, false, true, true);
        burger.charge();
        burger.description();

        DietBurger burger1 = new DietBurger(100, 10);
        burger1.additionalItem(true, true, true, true, true);
        burger1.charge();
        burger1.description();

    }

}























