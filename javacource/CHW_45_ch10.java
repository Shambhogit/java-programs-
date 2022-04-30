package com.javacource;
class base{
    int x;
    public void print(){
        System.out.println("i am from base class");
    }
}
class derive extends base {
    public void printd(){
        System.out.println("from derive class ");
    }

}
public class CHW_45_ch10 {
    public static void main(String[] args) {
        derive a1= new derive();
        a1.print();
        a1.printd();
    }
}
