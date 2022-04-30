package com.javacource;
class Base1{
    public void method1(){
        System.out.println("from method1 of class base1");
    }
    public void method2(){
        System.out.println("From method2 of class base1");
    }
}
class Derive{
    public void method2(){
        System.out.println("from method2 of derive class ");
    }
    public void method3(){
        System.out.println("from method3 of derive class");
    }
}

public class CWH_48 {
    public static void main(String[] args) {
        Derive d1= new Derive();
        d1.method2();
    }
}
