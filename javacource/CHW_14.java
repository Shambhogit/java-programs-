package com.javacource;

public class CHW_14 {
    public static void main(String[] args){
        String name = new String("ShAmBhO");
//        int value = name.length();//--->to print length of string
//        String lc = name.toLowerCase();
        String uc = name.toUpperCase();
        System.out.println(uc);
        String nonTrimString = "           shambho            ";
        System.out.println(nonTrimString.trim());

    }

}
