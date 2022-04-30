package com.javacource;

import java.util.Scanner;

public class cwh_81_specific_exception {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 44;
        marks[1] = 21;
        marks[2] = 54;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to divide");
        int ind = sc.nextInt();
        System.out.println("Enter the number to divide value");
        int num = sc.nextInt();
        try{
            System.out.println("Value at Index you enter is : "+marks[ind]);
            System.out.println("Value of division of marks-ind/num is : "+marks[ind]/num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch (Exception e){
            System.out.println("Some other Exception occurs ");
        }
    }
}
