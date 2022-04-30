package com.javacource;

import java.util.Scanner;
public class CHW_05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n , count = 0, i = 1;
        System.out.println("Enter any number");
        n = sc.nextInt();
        while(i<=n){
            if(n%i == 0){
                count++;
            }
            i++;
        }
        if(count == 2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("number is not a Prime number");
        }
    }
}
