package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vip_Account jisan_two = new Vip_Account();
        jisan_two.print();


        Vip_Account jisan_one = new Vip_Account("New Jisan", 185);
        jisan_one.print();

        Vip_Account jisan_three = new Vip_Account("Jisan", 1229, "jisananam1228@gmail.com");
        jisan_three.print();


    }
}
