package com.jprmanual;

import java.util.Scanner;
//write a program to implement single and multilevel inheritance
class Student{
    String name;
    Scanner sc = new Scanner(System.in);
    void getName(){
        System.out.println("Enter your name");
        name = sc.nextLine();
    }
}
class Marks extends Student{
    int marks_physics;
    int marks_chemistry;
    int marks_maths;
    int marks_biology;

    public void getMarks(){
        System.out.println("Enter the marks of physics out of 100");
        marks_physics = sc.nextInt();
        System.out.println("Enter the marks of chemistry out of 100");
        marks_chemistry = sc.nextInt();
        System.out.println("Enter the marks of maths out of 100");
        marks_maths = sc.nextInt();
        System.out.println("Enter the marks of biology out of 100");
        marks_biology = sc.nextInt();
    }
}
class Calculate extends Marks{
    float per;
    public void calculatePer(){
        System.out.println("Name of Student is : "+name);
        per = (marks_biology + marks_chemistry + marks_maths + marks_physics)/4;
        System.out.println("Percentage is : "+ per + "%");
    }
}
public class Prac_18a {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.getName();
        c1.getMarks();
        c1.calculatePer();
    }
}
