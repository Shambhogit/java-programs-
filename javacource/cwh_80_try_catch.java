package com.javacource;

public class cwh_80_try_catch {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("result is : "+c);
        }
        catch(Exception e){
            System.out.println("Not able to run this Reason : "+e);
        }
    }
}
