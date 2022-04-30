package com.javacource;

public class CWH_10 {
    public static void main(String[] args){
//        int a = 6*5-34/2;//Precedence and
//        System.out.println(a);
        for(int i=0;i<5;i++){
            for(int j =0;j < 5-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
