package com.javacource;

import java.util.Scanner;

public class Practic_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float income=0;
        System.out.print("Enter your income "  );
        income = s.nextFloat();
        if (income<2.5f){
            System.out.println("You have to pay 5% tax to guverment");
        }
        else if(income>2.5 && income<10.0f){
            System.out.println("You have to pay 20% tax to guverment");
        }
        else if(income>10.0){
            System.out.println("You have to pay 30% tax to guverment");
        }
    }
}
