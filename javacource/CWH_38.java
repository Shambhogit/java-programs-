package com.javacource;

import java.util.Scanner;

class Employee{
    int id ;
    String name;
    public void getEmployee(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = s.nextLine();
        System.out.println("Enter your id : ");
        id = s.nextInt();
    }
    public void getData(){
        System.out.println("My name is " + name );
        System.out.println("my id is " + id );
    }
}
public class CWH_38 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getEmployee();
        e1.getData();
    }
}
