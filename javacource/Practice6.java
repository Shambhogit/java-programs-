package com.javacource;

import java.util.Scanner;
public class Practice6 {
    static void table(){
        int n,sum=0;
        System.out.print("Enter number to print table : ");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i = 0;i<10;i++){
            sum +=n;
            System.out.println(sum);
        }
    }
    public static void main(String[] args)
    {
        table();
    }

}
