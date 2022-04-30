package com.PracticeDsa.ArrayOpration;
import java.util.Scanner;

public class Array {
    int [] arr = new int[100];
    int n;
    Scanner sc = new Scanner(System.in);
    public void getArray(){
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        System.out.println("Enter the " +n+" Element of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void printArray(){
        System.out.println("Element in array are");
        for(int i = 0;i<n;i++){
            System.out.print("[ "+arr[i]+" ]   ");
        }
    }
}

