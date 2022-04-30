package com.DSA2;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int a = 19;
        String name = "shambho";
//        an array is collection of same datatype
//        Syntax
//        datatype [] variable_name = new int [size];
//        to store 10 roll numbers
//        int [] roll = new int[10];//--->memory is allocated
//        we have 2D array
//        syntax is like int [][] arr  = new int [size][size];
//        int [][] arr = {
//                {1,2,3},
//                {4,5,},
//                {6, 7,8,9},
//        };
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
//        enhanced for loop
//        for(int [] b : arr){
//            System.out.println(Arrays.toString(b));
//        }

    }
}
