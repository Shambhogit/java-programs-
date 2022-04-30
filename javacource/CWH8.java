package com.javacource;

import java.util.Scanner;

public class CWH8 {
    public static void main(String[] args){
        int a,b;
        boolean s;//boolean
        System.out.println("enter two numbers : ");
        Scanner s1 = new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();
        int c=a+b;
        s=a<b;
        System.out.println(s);
        System.out.println("Sum of tow num is "+ c);
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("minus "+ d);
        System.out.println("multiplication "+ e);
        System.out.println("division "+ f);
        System.out.println("remainder "+ g);


    }

}
