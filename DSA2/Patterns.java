package com.DSA2;

public class Patterns {
    public static void main(String[] args){
        pattern5(5);
    }
    static void pattern2(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){

    }
}
