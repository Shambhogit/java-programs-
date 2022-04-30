package com.javacource;

import java.util.Scanner;

class Pattern{
    public void p1(){
        int n;
        System.out.print("enter number : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=0; i<n ; i++){
            for(int j=1; j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

}
public class Practice7 {
    public static void main(String[] args){
        Pattern p = new Pattern();
        p.p1();

    }
}
