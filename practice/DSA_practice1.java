package com.practice;

import java.util.Scanner;

class ArrayOperation{
    int i,n;
    int [] arr = new int [100];
    Scanner s = new Scanner(System.in);
    public void getArray(){
        System.out.println("Enter no of element in array");
        n = s.nextInt();
        System.out.println("Enter element of array ");
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
    }
    public void printArray(){
        System.out.println("Element present in array ");
        for (i=0;i<n;i++){
            if (arr[i]==0){
                break;
            }
            System.out.println(arr[i]);
        }
    }
    public void insertionInArray(){
        System.out.println("Enter element to insert");
        int data = s.nextInt();
        System.out.println("Enter index at which you want to insert");
        int index = s.nextInt();
        for(i=n-1;i>=index;i--){
            arr[i+1]=arr[i];
            n++;
        }
        for (i=0;i<index;i++){
            arr[index]=data;
        }
    }
    public void deletionInArray(){
        System.out.println("Enter element to delete ");
        int del = s.nextInt();
        for (i=0;i<n;i++){
            if(arr[i]==del){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
public class DSA_practice1 {
    public static void main(String[] args) {
        ArrayOperation a1 = new ArrayOperation();
        a1.getArray();
        a1.insertionInArray();
        a1.printArray();
        a1.deletionInArray();
        a1.printArray();
    }
}
