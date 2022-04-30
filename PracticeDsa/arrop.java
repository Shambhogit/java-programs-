package com.PracticeDsa;

import java.util.Scanner;

class array {
    private int [] arr = new int[10];
    private int i;
    private int size;
    public Scanner sc= new Scanner(System.in);
    public void getArray(){

        System.out.println("Enter the size of array : ");
        size=sc.nextInt();
        System.out.println("Enter the elements of array ");
        for( i = 0;i<size ;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void printArray(){
        for(i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public void insertionArray(){
        int index;
        int data ;
        System.out.println("Enter the data to insert : ");
        data=sc.nextInt();
        System.out.println("Enter the index to insert element : ");
        index=sc.nextInt();
        for( i = size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=data;
        size++;
    }
}

public class arrop {
    public static void main(String[] args) {
        array a1= new array();
        a1.getArray();
        a1.printArray();
        a1.insertionArray();
        a1.printArray();
    }
}
