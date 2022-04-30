package com.javacource;

import java.util.Scanner;

public class PSET1_4 {
    public static void main(String[] args) {
      int sub1,sub2,sub3;
        Scanner s =new Scanner(System.in);
        System.out.println("enter mark of 3 sub ");
        sub1 = s.nextInt();
        sub2 = s.nextInt();
        sub3 = s.nextInt();
        if (sub1>33 && sub2>33 && sub3>33){
            System.out.println("Your pass ");
        }
        else {
            System.out.println("Your fail");
        }
    }
}
