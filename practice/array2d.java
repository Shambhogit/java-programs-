package com.practice;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][3];
        int [][]arr1 = new int[3][3];
        System.out.println("enter first array ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second array ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
