package com.practice;

import java.util.Scanner;

public class practic_1_6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float []arr = new float[n];
        System.out.println("Enter the element in array ");
        float sum = 0;
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextFloat();
            sum += arr[i];
        }
        System.out.println("sum of array is "+sum);
    }
}
