package com.practice;

import java.util.Scanner;

class Array{
    int [] arr = new int[5];
    int i ;
    Scanner s1 = new Scanner(System.in);
    public void getArray(){
        System.out.println("Enter the Element in array ");
        for (i=0;i<5;i++){
            arr[i]=s1.nextInt();
        }
    }
    public int isSortedOrNot(){
        for (i=0;i<4;i++){
            if (arr[i] < arr[i+1]){
                    arr[i]=arr[i+1];

            }
            else {
                return 0;
            }

        }
        return 1;
    }
}

public class practice9 {
    public static void main(String[] args) {
        Array a1 = new Array();
        a1.getArray();
        if( a1.isSortedOrNot() == 1){
            System.out.println("Array is sorted ");
        }
        else {
            System.out.println("Array is not sorted ");
        }
    }
}
