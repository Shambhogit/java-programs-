package com.jprmanual;

import java.util.Scanner;

public class Prac_3b {
    //program to check number is even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number you entered is even");
        }
        else{
            System.out.println("Number you entered is odd ");
        }
    }
}
