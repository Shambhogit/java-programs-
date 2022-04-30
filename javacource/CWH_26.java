package com.javacource;

import java.util.Scanner;
public class CWH_26 {
    public static void main(String[] args)
    {
        int [] mark = new int [5];
//        mark [0]=100;
//        mark [1]=30;
//        mark [2]=44;
//        mark [3]=3;
//        mark [4]=42;
        System.out.println("Enter the element of array : ");
                Scanner sc = new Scanner(System.in);
        for (int i = 0;i<5;i++){
            System.out.printf("Enter element at index %d : ",i);
            mark[i]=sc.nextInt();
        }
        System.out.println("Element in array are ");
        for(int i=0;i<5;i++){
            System.out.println( mark[i]);
        }
    }
}
