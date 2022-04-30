package com.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int n){
        if(n<1){
            return -1;
        }
        else if(n==1){
            return 1;
        }
        return fact(n-1)*fact(n);
    }
}
