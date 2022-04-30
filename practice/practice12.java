package com.practice;

import java.util.Scanner;

class Searching{
    int []arr = new int[100];
    int i,n;
    Scanner a1 = new Scanner(System.in);
    public void getArr(){
        System.out.println("Enter the Number of Element in array");
        n = a1.nextInt();
        System.out.println("Enter element in array");
        for(i=0;i<n;i++){
            arr[i]=a1.nextInt();
        }
    }
    public void linearSearch(){
        int key;
        System.out.println("Enter the element to Find");
        key = a1.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==key){
                System.out.printf("Element %d if found at index %d",key,i+1);
                break;
            }
        }
    }
    public void insertion(){
        int index;
        int data;
        System.out.println("Enter the index to be element inserted at");
        index = a1.nextInt();
        System.out.println("Enter data to be insert");
        data = a1.nextInt();
        for(i=index;i<n+1;i++){
            arr[i+1]=arr[i];
        }
        for(i=0;i<index;i++){
            arr[index]=data;
        }
        n++;
    }
    public void printArr(){
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
public class practice12 {
    public static void main(String[] args) {
        Searching s = new Searching();
        s.getArr();
//        s.linearSearch();
        s.insertion();
        s.printArr();
    }
}
