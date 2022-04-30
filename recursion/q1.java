package com.recursion;

public class q1 {
    public static void main(String[] args) {
        print("shambho",9);
    }
    static void print(String str,int n){
        if(n==0){
            return;
        }
        System.out.println(str);
        n--;
        print(str,n);
    }
}
