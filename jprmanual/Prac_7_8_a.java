package com.jprmanual;

import java.util.Scanner;

//Develop a program to show the use of implicit typecasting
//or (same program for both)
//Write a program to implicitly typecast lower range data type to larger storage size datatype
public class Prac_7_8_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int i = sc.nextInt();
        System.out.println("integer you entered is : "+i+"\n");

        System.out.println("After Implicit Typecasting");
        float f = i;
        System.out.println("Float value of integer you entered is : "+f);
        double d = i;
        System.out.println("Double value of integer you entered is : "+d);
    }
}
