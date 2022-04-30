package com.jprmanual;
//Write a program to convert integer object value into primitive datatype byte short and double value
public class Prac_15_16d {
    public static void main(String[] args) {
        Integer i = 29000;
        //byteValue() method
        System.out.println(i.byteValue()); //return byte value of int

        //doubleValue() method return double value of int
        System.out.println(i.doubleValue());

        //ShortValue() method return short value of int
        System.out.println(i.shortValue());
    }
}
