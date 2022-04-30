package com.jprmanual;
/*
Define an Exception called "NotMatchException" that is thrown whe a string is not equal to "India" Write a program that uses this exception
 */

class NotMatchException extends Exception{
    public String toString(){
        return "NotMatchException";
    }
    public String getMessage(){
        return "NotMatchException message";
    }
}
public class prac_26_27b {
    static void matchString(String str) throws NotMatchException{
        if(str.equals("India")){
            System.out.println("Strings are equal");
        }
        else{
            throw new NotMatchException();
        }
    }

    public static void main(String[] args) {
        try {
//            matchString("Shambho");
            matchString("India");
        }
        catch (NotMatchException e){
            System.out.println(e.toString());
//            e.printStackTrace();
        }
        finally {
            System.out.println("Program finish");
        }
    }
}
