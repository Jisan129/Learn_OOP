package com.company;

public class Vip_Account {
    String name;
    int credit_limit;
    String email;

    public Vip_Account() {
        this("Default Name", 1000, "Default1228@gmail.com"); //This will call another constructor
        System.out.println("1st Constructor");
    }

    public Vip_Account(String name, int credit_limit) { //this is self sufficient
        this.name = name;
        this.credit_limit = credit_limit;
        System.out.println("2nd Constructor");
    }

    public Vip_Account(String name, int credit_limit, String email) { //This is also self sufficient
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("3rd Constructor");
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    public void print() {
        System.out.println(" " + name + " " + credit_limit + " " + email);
    }
}
