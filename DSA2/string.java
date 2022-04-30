package com.DSA2;

import java.util.Arrays;

public class string {
    public static void main(String[] args){

        //in java we have String pool so we can optimise program;
        String name = "Shambho jaybhye";
        String a = "Shambho jaybhye";
        System.out.println(name==a);

        //if we want to make two different String
        String  b = new String("shambho");
        String c = new String("shambho");
        System.out.println(b==c);

        //if i want to chake values of string then we have equals() method
        System.out.println(b.equals(c));

        //if we want character at any index we have method called charAt();
        System.out.println(b.charAt(4));
        System.out.println(b.length());
        int s = 100;
        System.out.println(s);
        // differnt out puts
        System.out.println(43);
        System.out.println("harsh");
        System.out.println(Arrays.toString(new int[]{5,4,3,2,1}));
        String j =null;
        System.out.println(j);
    }
}
