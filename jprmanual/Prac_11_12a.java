package com.jprmanual;

//Write a program to show the use of all methods of String class
public class Prac_11_12a {
        public static void main(String[] args) {
            String name = "Virat Kohali";
            //charAt() method
            System.out.println(name.charAt(3));

            String name2 = " Rohit sharma";
            //concat() method
            System.out.println(name.concat(name2));

            //equals() method
            System.out.println(name.equals(name2));
            String n1 = "Virat Kohali";
            System.out.println(name.equals(n1));

            //equalsIgnoreCase() method (this method ignores upper case and lower case
            String a1 = "ShambhO JayBhaye";
            String a2 = "shambho jaybhaye";
            System.out.println(a1.equalsIgnoreCase(a2));

            //length() method
            System.out.println(a1.length());

            //replace(oldChar,NewChar) method
            String r1 = a1.replace("a","b"); // all a will be replace with b
            System.out.println(r1);

            //startsWith(String prefix) method
            System.out.println(a1.startsWith("S"));
            System.out.println(a1.startsWith("b"));

            //endsWith(String suffix) method
            System.out.println(a1.endsWith("e"));
            System.out.println(a1.endsWith("b"));

            //indexOf(int ch) method
            System.out.println(a1.indexOf('a'));

            //substring(start index)
            String sub = a1.substring(8);
            System.out.println(sub);

            //lastIndexOf(int ch) method
            System.out.println(a1.lastIndexOf('a'));
        }
}
