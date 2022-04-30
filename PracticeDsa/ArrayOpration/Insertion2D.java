package com.PracticeDsa.ArrayOpration;

public class Insertion2D extends Array2D {
    public void insertDataInRow(){
        System.out.println("\nEnter the data to insert");
        int data = sc.nextInt();
        System.out.println("Enter row number");
        int rowNo = sc.nextInt();
        System.out.println("Enter the index in row No in "+rowNo);
        int index = sc.nextInt();
        for(int i = arr[rowNo].length-1; i>=index;i--){
            arr[rowNo][i+1] = arr[rowNo][i];
        }
        arr[rowNo][index] = data;
    }
}
