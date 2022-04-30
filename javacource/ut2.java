package com.javacource;

import java.util.Scanner;

class student {
    int [] id = new int[5];
    String [] name = new String[5];
    Scanner sc = new Scanner(System.in);
    public void SetData(){
        for (int i = 0 ;i<5;i++){
            System.out.println("Enter the Name of "+(i+1)+" Student");
            name[i]= sc.next();
            System.out.println("Enter the id of "+(i+1)+" Student");
            id[i] = sc.nextInt();
        }
    }
    public void display(){
        for (int i = 0 ;i<5;i++){
            System.out.println("Name of Student is : "+name[i]);
            System.out.println("id of Student is : "+id[i]);
        }
    }
}
public class ut2 {
    public static void main(String[] args) {
        student s = new student();
        s.SetData();
        s.display();
    }
}
