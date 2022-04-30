package com.jprmanual;
//Write a program to implement all methods of stringBuffer class
public class Prac_11_12b {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Shambho jaybhaye");
        System.out.println(name);

        // append(StringBuffer obj)
        System.out.println(name.append(10)); //integer value
        System.out.println(name.append('c')); //charecter value
        System.out.println(name.append(true)); //boolean value
        System.out.println(name.append(75.32f)); //float value

        //insert(position , string str)
        System.out.println(name.insert(16," Programming ")); // insert string
        System.out.println(name.insert(31,'a'));// insert char
        System.out.println(name.insert(8,10)); // insert int

        //setLength(int i);
        name.setLength(10);
        System.out.println(name);

        //setCharAt(int index, char ch);
        name.setCharAt(4,'o');
        System.out.println(name);

        //reverse()
        System.out.println(name.reverse());
    }
}
