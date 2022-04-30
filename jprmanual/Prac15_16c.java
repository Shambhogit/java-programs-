package com.jprmanual;
//Write a program to make use of character wrapper class methods
public class Prac15_16c {
    public static void main(String[] args) {
        Character up = 'A';
        Character lo = 'a';
        Character in = '5';

        //isLetter() method
        System.out.println(Character.isLetter(up));
        System.out.println(Character.isLetter(in));

        //isDigit() method
        System.out.println(Character.isDigit(up));
        System.out.println(Character.isDigit(in));

        //isWhitespace() method
        System.out.println(Character.isWhitespace(up));
        Character wp = ' ';
        System.out.println(Character.isWhitespace(wp));

        //isUpperCase() method
        System.out.println(Character.isUpperCase(up));
        System.out.println(Character.isUpperCase(lo));

        //isLowerCase() method
        System.out.println(Character.isLowerCase(up));
        System.out.println(Character.isLowerCase(lo));

        //toLowerCase() method and toUpperCase() methods
        Character a = 'A';
        System.out.println(Character.toLowerCase(a));
        Character b = 'b';
        System.out.println(Character.toUpperCase(b));


    }
}
