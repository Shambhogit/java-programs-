package com.DataStructure;

import java.util.Scanner;

public class DSA_1 {
    public static void main(String[] args){
        System.out.println("Enter no of element in array");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n+1];
        System.out.println("Enter element in array ");
        for(int i=0;i<n;i++){
               arr[i] = s1.nextInt();
        }
        System.out.println("Elements are ");
        for (int i= 0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nEnter Element to be insert");
        int data = s1.nextInt();
        System.out.println("Enter index to insert at ");
        int index = s1.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<index){
                arr1[i]=arr[i];
            }
            else if (i==index){
                arr1[i]=data;
            }
            else{
                arr1[i]=arr[i-1];
            }
        }
        System.out.println("Elements are ");
        for (int i= 0;i<n+1;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
