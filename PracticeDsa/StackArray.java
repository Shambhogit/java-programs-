package com.PracticeDsa;

public class StackArray {
    int MAX_SIZE = 10;
    int [] arr = new int[MAX_SIZE];
    int top = -1;

    void push(int data){
        if(top==(MAX_SIZE-1)){
            System.out.println("Stack overflow");
        }
        top=top+1;
        arr[top]=data;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else {
        top=top-1;}
    }
    int peek (){
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
    void displayElementInStack(){
        int temp = top;
       while (temp!=-1){
            System.out.println(arr[temp]);
            temp--;
        }
    }
    public static void main(String[] args){
        StackArray s1= new StackArray();
        s1.push(10);
        s1.push(34);
        s1.push(54);
//        s1.pop();
//        s1.pop();
//        s1.pop();
        s1.displayElementInStack();
    }
}
