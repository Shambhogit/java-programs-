package com.DSA2;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the power of number");
        int b = sc.nextInt();
        int qud = 0;
        for (int i = 2;i<=b;i++){
            if(qud==0) {
                qud += a * a;
            }
            else
            {
                qud +=a*qud;
            }
        }
        System.out.println(qud);
    }
}
