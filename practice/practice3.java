package com.practice;

import java.util.Scanner;

class search{

    public int [] arr = new int[5];

    Scanner s1 = new Scanner(System.in);
    public void getArr(){
        System.out.println("Enter 10 element of array ");
        for(int i=0;i<5;i++){
            arr[i]=s1.nextInt();
        }
    }
    public void searchArr(){
        int key;
        System.out.println("Enter the elemtet to find in array ");
        key=s1.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                System.out.printf("Element %d id found at index %d ",key,i+1);
                break;
            }

        }
    }
}
public class practice3 {
    public static void main(String[] args) {
        search s = new search();
        s.getArr();
        s.searchArr();
    }
}
