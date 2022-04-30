package com.practice;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Collage {
    protected String coll_code;
    protected String coll_name;
    protected String coll_loc;
    protected Scanner s1 = new Scanner(System.in);
    public void getCollage(){
        System.out.print("Enter the name of collage : ");
        coll_name = s1.nextLine();
        System.out.print("Enter the Collage code : ");
        coll_code = s1.next();
        System.out.print("Enter the location of collage : ");
        coll_loc = s1.nextLine();
    }
}
class Student extends Collage{
    String roll_num;
    String name;
    String stream;
    String year;
    Scanner s1 = new Scanner(System.in);
    public void getStudent(){
        System.out.print("Enter name of student : ");
        name = s1.nextLine();
        System.out.print("Enter roll number of Student : ");
        roll_num = s1.next();
        System.out.print("Enter stream Your Studing in : ");
        stream = s1.nextLine();
        System.out.print("Enter class in which your Studing : ");
        year = s1.nextLine();
    }
    public void disPlay(){
        System.out.println("******** collage information ********");
        System.out.println("name of collage : "+coll_name);
        System.out.println("code of collage : "+coll_code);
        System.out.println("location of collage : "+coll_loc);
        System.out.println("******** Student information *******");
        System.out.println("name of student : "+name);
        System.out.println("Roll number of student : "+roll_num);
        System.out.println("Stream of student : "+stream);
        System.out.println("Class of student : "+year);
    }
}
public class practice11 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.getCollage();
        s1.getStudent();
        s1.disPlay();
    }
}
