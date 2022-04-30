package com.javacource;

import java.util.Scanner;

class emp {
    int []id = new int [5] ;
    int []salary = new int [5];
    Scanner sc = new Scanner(System.in);
    public void getData(){
        for(int i = 0;i<5;i++){
            System.out.println("enter the id of "+(i+1)+"employee");
            id[i] = sc.nextInt();
            System.out.println("enter the salary of "+(i+1)+"employee");
            salary[i] = sc.nextInt();
        }
    }
    public void getMax(){
        int max = 0;
        for(int i = 0;i<5;i++){
            if(salary[max]<salary[i]){
                max = i;
            }
        }
        System.out.println("id is : " +id[max]);
        System.out.println("salary is : "+salary[max]);
    }
}
public class ut {
    public static void main(String[] args) {
        emp e = new emp();
        e.getData();
        e.getMax();
    }
}
