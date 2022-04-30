package com.javacource;

import java.util.Scanner;

public class PSET1_1 {
    public static void main(String[] args) {
        int java, dsu, dbms;
        float total=0,cgpa=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mark of JAVA : ");
        java = s.nextInt();
        System.out.println("Enter mark of DSU: ");
        dsu = s.nextInt();
        System.out.println("Enter mark of DBMS : ");
        dbms = s.nextInt();
        total=java+dbms+dsu;
        cgpa=(total/300)*10;
        System.out.println("CGPA of student is : "+ cgpa);

    }
}
