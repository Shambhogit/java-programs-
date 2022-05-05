package com.JavaOneShotOOP;
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{  // single inheritance
       public void area(int l,int h){
           System.out.println(1/2*h*l);
       }
}
class Circle extends Shape{ //hairarchicl inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
class EquilateralTriangle extends Triangle{ //multilevel inheritance
    public void area(int l,int h){
        System.out.println(1/2*h*l);
    }
}

public class Inheritance {
    public static void main(String[] args) {

    }
}
