package com.javacource;

public class CHW_33 {
    static int sum (int...arr)
    {
        int result=0;
        for(int a : arr){
            result +=a;
        }
        return result;
    }
     public static void main(String[] args){
        System.out.println("Welcome to varargs Tutorial");
        System.out.println("sum of 3 , 2 is "+ sum(3,4));
        System.out.println("sum of 3 , 2  and 10 is "+ sum(3,4,10));
//        we can pass as may as we want ;

    }
}
