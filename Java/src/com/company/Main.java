package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int can=0,cannot=0;
        Scanner scan =new Scanner(System.in);
        int qustion_number=scan.nextInt();
        //System.out.println(" "+qustion_number);
        int dificulty=scan.nextInt();

       int [] fruits=new int[10000];
       for(int i=0;i<qustion_number;i++){
           fruits[i]=scan.nextInt();
       }
       //for(int i=0;i<qustion_number;i++){
         //  System.out.println(" "+fruits[i]);
       //}

        for(int i=0;i<qustion_number;i++){
            if(cannot>1){
                //System.out.println(" "+can);
                break;
            }
            else if(fruits[i]<=dificulty){
               can++;
            }
            else if(fruits[i]>dificulty){
                cannot++;
            }
        }
        System.out.println(" "+can);



    }
}
