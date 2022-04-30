package com.recursion;

public class q2 {
    public static void main(String[] args) {
        printnum(4,1);
    }
    static void printnum(int n,int a){
        if(a==n){
            return;
        }

        a++;
        System.out.println(a);
        printnum(n,a);
    }
}
