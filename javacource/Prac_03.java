package com.javacource;

import java.util.Scanner;

public class Prac_03 {
    public static void main(String[] args) {
        int num,sum=0;
        System.out.println("Enter any num");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for(int i = 2; i<num;i++){
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println("sum of even number is : "+sum);

    }
}
