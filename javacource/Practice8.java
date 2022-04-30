package com.javacource;

import java.util.Scanner;

public class Practice8 {
    static void fibonachi(){
        int n1=0,n2=1,n3,n;
        System.out.println("enter number : ");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        System.out.println(n1);
        System.out.println(n2);

        for(int i=2;i<n;i++){

            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }

    }

    public static void main(String[] args) {
        fibonachi();

    }
}
