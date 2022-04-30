package com.jprmanual;
//Write a program to shw the use of integer wrapper class methods
public class Prac15_16a {
    public static void main(String[] args) {
        Integer i =  100;
        System.out.println(i);

        //parseInt(String obj)
        String sr = "100";
        int b = Integer.parseInt(sr); //convert string to Integer
        System.out.println(b);

        //toString();
        System.out.println(Integer.toString(i)); //convert int to String

        //byteValue() method
        System.out.println(i.byteValue()); //return byte value of int

        //doubleValue() method return double value of int
        System.out.println(i.doubleValue());

        //floatValue() method return float value of int
        System.out.println(i.floatValue());

        //ShortValue() method return short value of int
        System.out.println(i.shortValue());

        //compareTo(int i) methode compare int
        System.out.println(i.compareTo(101)); //i < 101 return -1
        System.out.println(i.compareTo(100)); //i== 100 return 0
        System.out.println(i.compareTo(99)); //i>99 return 1

    }
}
