package com.practice;

import java.util.Scanner;

class avgarray{
    float [] arr = new float[100];
    int n;
    Scanner s1= new Scanner(System.in);

    public void getArr(){
        System.out.println("Enter no of element in array ");

        n= s1.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=s1.nextFloat();
        }
    }
    public float avgArr(){
        float avg= 0;
        for(float a : arr){
            avg+=a;
        }
        return avg/n;
    }
}
public class practice4 {
    public static void main(String[] args) {
     avgarray a1 = new avgarray();
     a1.getArr();
        System.out.println(a1.avgArr());
    }
}
