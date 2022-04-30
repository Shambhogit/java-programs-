package com.practice;

import java.util.Random;
import java.util.Scanner;

public class SPSgame {
    public static void main(String[] args) {
        int choice;
        System.out.println("Enter choice \n1.stone\n2.paper\n3.scissor");
        Scanner s1=new Scanner(System.in);
        choice = s1.nextInt();
        Random r1 = new Random();
        int computerInput = r1.nextInt(1,3);
        System.out.println(computerInput);

        if(choice == computerInput){
            System.out.println("Draw");
        }
        else if(choice==1 && computerInput==2 || choice==1 && computerInput==3 || choice==3 && computerInput==2){
            System.out.println("You Win");
        }
        else {
            System.out.println("computer win");
        }
    }
}
