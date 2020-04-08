package com.company;

public class Locker {
    private String pass;

    public Locker(String pass) {
        this.pass = pass;
    }

    public void open(String code) {
        System.out.println("Open Lock " + code + " " + pass);
    }
}
