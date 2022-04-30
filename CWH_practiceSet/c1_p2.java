package com.CWH_practiceSet;

import java.util.Scanner;

//Write a programm to calculate CGPA using marks of three subjects
public class c1_p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of MATH (0 - 100)");
        float math = sc.nextInt();
        System.out.println("Enter the marks of SCIENCE (0 - 100)");
        float science = sc.nextInt();
        System.out.println("Enter the marks of HISTORY (0 - 100)");
        float history = sc.nextInt();

        float cgpa = ((math+science+history)/3)/10;
        System.out.println("Your CGPA is : "+cgpa);

    }
}
