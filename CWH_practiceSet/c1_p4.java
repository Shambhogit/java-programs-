package com.CWH_practiceSet;

import java.util.Scanner;

//Write a java program to convert kilometers to miles;
public class c1_p4 {
    public static void main(String[] args) {
        System.out.println("Enter the distance in Kilometers");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        double miles = km * 0.6213;
        System.out.println("Miles Value of distance you enter is : "+miles);
    }
}
