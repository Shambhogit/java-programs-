package com.DSA2;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        int div = a/b;
        int sub = a-b;
        int mul = a*b;
        System.out.println(sum);
        System.out.println(div);
        System.out.println(sub);
        System.out.println(mul);
    }
}
