package com.jprmanual;

import java.util.Scanner;

//Write any program to display pyramids of stars using increment / decrement
public class Prac_5d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = sc.nextInt();
        System.out.println("Pyramid pattern \n");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
