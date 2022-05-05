package com.JavaOneShotOOP;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    Student(){ //default constructor
        System.out.println("Constructor called");
    }

    Student(String name , int age){ //parameterized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Test {
    public static void main(String []args){
       Student s1 = new Student();
       s1.name = "Tilak";
       s1.age = 10;
       s1.printInfo();

       Student s2= new Student("aman",24);
       s2.printInfo();

       Student s3 = new Student(s2);
       s3.printInfo();

    }
}
