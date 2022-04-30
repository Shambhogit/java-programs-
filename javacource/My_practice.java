package com.javacource;

import java.util.Scanner;

public class My_practice {
    public static void main(String[] args ){
        int a;
        do{
        System.out.println("1.1 to 10 \n2.10 to 1\n3.Even numbers\n4.odd numbers\n5.Exit");
        System.out.println("Enter your choice");
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        switch (a) {
            case 1:
                System.out.println("1 To 10 ");
                for (int i = 0; i < 11; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                int i = 10;
                while (i <= 10) {
                    System.out.println(i);
                    i--;
                }
                break;
            case 3:
                int num;
                System.out.println("Enter the number up to which you want to print even numbers");
                num = sn.nextInt();
                int j = 0;
                do {
                    j = j + 2;
                    System.out.println(j);
                } while (j <= num);
                break;
            case 4:
                int n;

                System.out.println("Enter the number up to which you want to print even numbers");
                n = sn.nextInt();
                int k = 1;
                do {

                    System.out.println(k);
                    k = k + 2;

                } while (k <= n);
                break;
            case 5 :
                break;

            default:
                System.out.println("Enter valid choice !!!");
        }
        }while (a!=5);
    }
}
