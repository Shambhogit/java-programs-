package com.practice;

import java.util.Scanner;

class minarr{
    int [] arr = new int[5];
    int i;
    Scanner s1 = new Scanner(System.in);
    public void getArr(){
        System.out.println("Enter the element of array ");
        for(i=0;i<5;i++){
            arr[i] = s1.nextInt();
        }
    }
    public void minEle(){
        int max=0;
        for(i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in Array is : "+max);
        for (i=0;i<5;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("smallest element in array is : "+max);
    }
}
public class practice8 {
    public static void main(String[] args) {
        minarr a1 = new minarr();
        a1.getArr();
        a1.minEle();
    }
}
