package com.javacource;

public class Practice9 {
    static float avg(float...arr){
        float v=0;
        for(float a : arr){
            v += a;
        }
        return v/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(avg(2,3,4,5,6,7));
    }
}
