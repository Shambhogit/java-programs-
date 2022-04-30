package com.practice;

import java.util.Scanner;

class sumarr{
    float [] arr = new float[10];
    Scanner s1 = new Scanner(System.in);
    public void getArr(){
        System.out.println("Enter 10 element of array ");
        for(int i=0;i<10;i++){
            arr[i]=s1.nextFloat();
        }
    }
    void sumArr(){
        float sum=0;
        for(float a : arr){
            sum+=a;
        }
        System.out.println("Sum of array element is : "+sum);
    }

}
public class practice2 {
    public static void main(String[] args) {

        sumarr a1 =new sumarr();
        a1.getArr();
        a1.sumArr();
    }
}
