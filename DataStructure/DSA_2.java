package com.DataStructure;

import java.util.Scanner;

public class DSA_2 {
    public static void main(String[] args) {
        System.out.println("Enter on of element in array ");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n-1];
        System.out.println("Enter Element of array");
        for(int i=0;i<n;i++){
            arr1[i]=s1.nextInt();
        }
        System.out.println("Enter index of element to be deleted");
        int data = s1.nextInt();
        for(int i=0;i<n-1;i++) {
            if (i < data) {
                arr2[i] = arr1[i];
            } else if (i == data)
                continue;
             else {
                arr2[i-1] = arr1[i];
            }
        }
        System.out.println("Element in arr after deletion");
        for(int i=0;i<n-1;i++){
            System.out.println(arr2[i]);
        }
    }
}
