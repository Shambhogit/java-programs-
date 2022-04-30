package com.jprmanual;
/* Develop a program to show the use of explicit type casting
and same program for
Write a program to convert variable of basic data types and shows result of explicit typecasting
 */
public class Prac_9a {
    public static void main(String[] args) {
        float f = 87.878f;
        long l = 321111875454L;
        double d = 54.4323235543d;
        System.out.println("Float value is : "+f);
        int i = (int)f;
        System.out.println("integer value after type explicit casting is : "+i);
        System.out.println("Long value is : "+l);
        short s = (short) l;
        System.out.println("Short value after type explicit casting is : "+s);
        System.out.println("Double value is : "+d);
        int integer = (int)d;
        System.out.println("integer value after type explicit casting is : "+integer);
    }
}
