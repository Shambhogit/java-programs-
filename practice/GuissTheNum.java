package com.practice;


import java.util.Random;
import java.util.Scanner;

class guise{
    int num;
    Scanner s1 = new Scanner(System.in);
    Random r1 = new Random();
    public void getNum(){
        System.out.println("Enter your guise ");
        num = s1.nextInt();
        int computerInput = r1.nextInt(0,5);
        if(computerInput<num){
            System.out.println(computerInput);
            System.out.println(num);
            System.out.println("Number guiss by user is Greater than Computer number");
        }
        else if(computerInput==num){
            System.out.println(computerInput);
            System.out.println(num);
            System.out.println("Number guiss by user is equals Computer number");
        }
        else if (computerInput>num) {
            System.out.println(computerInput);
            System.out.println(num);
            System.out.println("Number guiss by user is smaller than Computer number");
        }
    }
}
public class GuissTheNum {
    public static void main(String[] args) {
        guise g1 = new guise();
        g1.getNum();
    }
}
