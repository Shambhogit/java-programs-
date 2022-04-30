package com.jprmanual;

import java.util.Scanner;
/* Develop a program to accept a password from the user ad throw "Authentication Failure " exception if password is incorrect */
class AuthenticationFailure extends Exception{
    public String toString(){
       return "com.jprmanual.AuthenticationFailure";
    }

    @Override
    public String getMessage() {
        return "Exception occured";
    }
}
public class prac23_24_25b {
    public static void main(String[] args) {
        int pass = 12345;
        System.out.println("Enter the password");
        int a = new Scanner(System.in).nextInt();
        if(a != pass){
            try {
                throw new AuthenticationFailure();
            }
            catch (AuthenticationFailure e){
                System.out.println(e);
            }
        }
        else {
            System.out.println("password is correct");
        }
    }
}
