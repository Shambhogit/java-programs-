package com.jprmanual;

import java.util.Scanner;

//Demonstrate the use of Overriding method display() using super and subclasses
class Parent{
    int a , b , c  ;
    Scanner sc = new Scanner(System.in);
    public void getData(){
            System.out.println("Enter the first number");
            a = sc.nextInt();
            System.out.println("Enter the second number");
            b = sc.nextInt();
    }
    public void addData(){
              c = a+b;
    }
    public void display(){
            System.out.println("Addition is : "+c);
    };
}
class SubClass extends Parent{
        float d ;
        public void divideData(){
                d = a/b;
        }
        @Override
     public void display(){
                System.out.println("Division is : "+d);

        }
}
public class Prac_17a {
        public static void main(String[] args) {
                SubClass sb1 = new SubClass();
                sb1.getData();
                sb1.divideData();
                sb1.display();
        }
}
