package com.DataStructure;

import java.util.Scanner;

class stack1 {
    int n = 10;
    int [] arr = new int[n];
    int top = -1;
    Scanner s = new Scanner(System.in);
    void push(int data){
        if(top==(n-1)){
            System.out.println("Stack OverFlow");
        }
        else{
//            System.out.println("Enter data To insert : ");
//            data = s.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("Element is Inserted "+data);
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else {
            System.out.println("pop element is " + arr[top]);
            top=top-1;
        }
    }

    void display(){
        while (top!=-1){
            System.out.println(arr[top]);
            top--;
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        stack1 s1 = new stack1();
        s1.push(10);
        s1.push(32);
        s1.push(54);
        s1.push(12);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();





    }
}
