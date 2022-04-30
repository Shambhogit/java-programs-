package com.practice;

import java.util.Scanner;

class aarr{
    int [] arr = new int[5];
    int i;
    Scanner s1= new Scanner(System.in);
    public void getArr(){
        for (i=0;i<5;i++){
            arr[i] = s1.nextInt();
        }
    }
    public void hiArr(){
        int a = 0;
        for(i=0;i<5;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        System.out.println("hightes num in Array is "+ a);
    }

}

public class practice7 {
    public static void main(String[] args) {
        aarr a1 = new aarr();
        a1.getArr();
        a1.hiArr();
    }
}
