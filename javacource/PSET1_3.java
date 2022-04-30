package com.javacource;

import java.util.Scanner;

public class PSET1_3 {
    public static void main(String[] args) {
//        1 km = 06 mile;
        float km,mile;
        System.out.println("Enter the length in KM ");
        Scanner s = new Scanner(System.in);
        km = s.nextFloat();
        mile= km * 0.62f;
        System.out.println("You entered length "+ km + " KM and after counversion in mile is "+mile+" Mile");


    }
}
