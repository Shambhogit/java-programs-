package com.jprmanual;
//Develop a program to use logical operators in do-while loop
public class Prac_6a {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        while (a>0 && b>0){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            a--;
            b--;
        }
    }
}
