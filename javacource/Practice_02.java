package com.javacource;

import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int day;
        System.out.println("Enter the day of week ");
        day=s.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter day between 1-7");
        }
    }
}
