package com.practice;

public class practice_17_01 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i<n;i++){
            for(int j = 1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int k = 0 ;k<i+1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int k = 0 ;k<i+1;k++){
                System.out.print("  ");
            }
            for(int j = 0;j<n-i+1;j++){
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}
