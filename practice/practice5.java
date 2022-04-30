package com.practice;

import java.util.Scanner;

class newarr{
    int [][] arr1 = new int[2][3];
    int [][] arr2 = new int[2][3];
    int [][] sum = new int[2][3];
    int i,j,k;
    Scanner s1 = new Scanner(System.in);
    void getArr(){
        System.out.println("Enter First Matrix");
        for ( i=0;i<2;i++){
            for( j=0;j<3;j++){
                arr1[i][j]= s1.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                arr2[i][j]=s1.nextInt();
            }
        }
    }
    void sumArr(){
        System.out.println("Addition of Two matrix is");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

}

public class practice5 {
    public static void main(String[] args) {
        newarr a1= new newarr();
        a1.getArr();
        a1.sumArr();
    }
}
