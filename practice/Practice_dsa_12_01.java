package com.practice;

import java.util.Scanner;

class Array1{
    int []arr = new int[100];
    int i,n;
    Scanner sc= new Scanner(System.in);
    void getArray() {
        System.out.println("Enter Size of Array");
        n=sc.nextInt();
        System.out.println("Enter Element in array");
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
    }
    public void Display(){
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
public class Practice_dsa_12_01 {
    public static void main(String[] args) {
        Array1 n1 = new Array1();
        n1.getArray();
        n1.Display();
    }
}
