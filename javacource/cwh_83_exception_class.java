package com.javacource;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return super.toString() +" I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am getMessage() ";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        if(a<100) {
            try {
//                throw new MyException();
                throw new ArithmeticException("This is exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
