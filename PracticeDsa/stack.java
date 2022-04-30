package com.PracticeDsa;
class stack1{
    int top = -1;
    int max =10;
    int []arr= new int[max];

    public void push(int data){
        if(top==max){
            System.out.println("Stack overflow");
        }else {
             top++;
            arr[top] = data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow ");
        }else {
            top = top - 1;
        }
    }
    public void printstack(){
        for(int i = top;i> -1;i--){
            System.out.println(arr[i]);
        }
    }
}
public class stack {
    public static void main(String[] args){
        stack1 s = new stack1();
        s.push(40);
        s.push(54);
        s.push(12);
        s.push(87);
        s.pop();
        s.printstack();
    }
}
