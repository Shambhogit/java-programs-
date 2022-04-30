package com.PracticeDsa.ArrayOpration;

import java.util.Scanner;

public class Array2D {
    public int [][] arr = new int[100][100];
    int rows , column;
    Scanner sc = new Scanner(System.in);
    public void getArray(){
        System.out.println("Enter the number of rows in array");
        rows = sc.nextInt();
        System.out.println("Enter the number of column in array");
        column = sc.nextInt();
        System.out.println("Enter the element in array");
        for(int i = 0;i<rows;i++){
            for (int j = 0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void printArray(){
        System.out.println("\nElements in array are");
        for(int i = 0;i<rows;i++){
            for (int j = 0;j<arr[rows].length;j++){
                if(arr[i][j] == 0){
                    break;
                }
                System.out.print("[ "+arr[i][j]+" ]  " );
            }
            System.out.println();
        }
    }
}
