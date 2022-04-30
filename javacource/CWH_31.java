package com.javacource;

public class CWH_31 {
    int sum(int a, int b){
        int c ;
        if (a<b){
            c=a+b;
        }
        else
        {
            c=a*b;
        }
        return c;
    }
    public static void main(String[] args){
        /* int a=20;
        int b=30;
        int c=(a+b)*2;
        System.out.println(c);*/
        CWH_31 s = new CWH_31();
        System.out.println(s.sum(33,54));
    }
}
