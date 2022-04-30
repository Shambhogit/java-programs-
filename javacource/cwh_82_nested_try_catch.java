package com.javacource;

import java.util.Scanner;

public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int []arr = {43,12,54,2,1,24,23};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index ");
        int ind = sc.nextInt();
        try{
            System.out.println("Index entered is "+ind);
            try {
                System.out.println("Data at Index is : "+arr[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is invalid");
                System.out.println("Exception : ArrayIndexOutOfBoundsException");
                System.out.println("Exception at level two");
            }
        }
        catch (Exception e){
            System.out.println("Error occur at some thing");
        }
        System.out.println("Try catch Block Complited");
    }
}
