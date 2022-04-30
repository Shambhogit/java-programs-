package com.CWH_practiceSet;
import java.util.Scanner;
//Write a java program which asks the user to enter hes name and gets them with hello+name have a good day
public class c1_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", have a good day");
    }
}
