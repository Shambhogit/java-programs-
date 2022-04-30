package com.practice;

import java.util.Scanner;

public class Practice_18_01 {
    public static void main(String[] args) {
        int i,j;
        Scanner s = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("enter element");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        i=0;
        j=0;
        int k = 2;
        int l = 0;
        int sum = 0;
        while (k>=0&&l<3){
            if(k==2-l) {
                sum += arr[l][k];
            }
            k--;
            l++;
        }
        System.out.println("sum of right to left digonal element "+sum);
        int left_to_right=0;
        while (i<3&&j<3){
            if(i==j){
                left_to_right+=arr[i][j];
            }
            i++;
            j++;
        }
        System.out.println("sum of left to right digonal element "+left_to_right);
        System.out.println("Sum of to digonal element is : "+(left_to_right+sum-arr[1][1]));
    }
}
