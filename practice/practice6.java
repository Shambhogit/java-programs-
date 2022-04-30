package com.practice;

import java.util.Scanner;

class Rarr{
    int [] arr = new int[5];
    int i;
    Scanner s1 = new Scanner(System.in);
    public void getArr(){
        System.out.println("Enter Element of array ");
        for(i=0;i<5;i++) {
            arr[i] = s1.nextInt();
        }
    }
    public void revArr(){
        for (i=4;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
}
public class practice6 {
    public static void main(String[] args){
      Rarr a1 = new Rarr();
      a1.getArr();
      a1.revArr();

    }
}
