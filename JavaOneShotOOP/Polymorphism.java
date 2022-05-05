package com.JavaOneShotOOP;
// function overloading

class Student1 {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " "+ age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.printInfo("shambho");
        s1.printInfo(12);
        s1.printInfo("vishal",21);
    }
}
