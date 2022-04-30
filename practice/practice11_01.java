package com.practice;

import java.util.Scanner;

interface Math{
    public void sumTwoNum();
    public void MulTwoNum();
}
class MathOperator implements Math{
    int a,b;
    public void sumTwoNum() {
        System.out.println("enter two num");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Sum of Two Number is : "+(a+b));
    }
    public void MulTwoNum(){
        System.out.println("Multiplication of Two number is : "+(a*b));
    }
}
public class practice11_01 {
    public static void main(String[] args) {
        MathOperator m1 = new MathOperator();
        m1.sumTwoNum();
        m1.MulTwoNum();
    }
}
