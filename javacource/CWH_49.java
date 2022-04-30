package com.javacource;
class Phone {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("on phone...");
    }
}
class SmartPhone extends Phone{
    public void greet2(){
        System.out.println("Good night");
    }
    public void on(){
        System.out.println("on SmartPhone...");
    }
}
public class CWH_49 {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
    }
}
