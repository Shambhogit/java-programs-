package com.javacource;

import java.util.Scanner;

public class practic_04 {
    public static void main(String[] args) {
        System.out.println("Enter number to show table");
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        int table = 0;
        for(int i = 0; i < 10 ; i++){
            table += num;
            System.out.println(table);
        }


    }
}
