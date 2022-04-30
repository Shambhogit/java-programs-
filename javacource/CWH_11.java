package com.javacource;


import java.util.Scanner;

public class CWH_11 {
    public static void main(String[] args){
    float total=0 ,per=0;
        Scanner s = new Scanner(System.in);
    int oop,dsu,dbms,dte,cgr;
    System.out.println("Enter mark of OOP : ");
        oop=s.nextInt();
        System.out.println("Enter mark of DTE : ");
        dte=s.nextInt();
        System.out.println("Enter mark of DBMS : ");
        dbms=s.nextInt();
        System.out.println("Enter mark of CGR : ");
        cgr=s.nextInt();
        System.out.println("Enter mark of DSU : ");
        dsu=s.nextInt();
        total=oop+dsu+dte+cgr+dbms;
        per=(total*100)/500;
        System.out.println("Total Persentage of student is : "+ per);


    }

}
