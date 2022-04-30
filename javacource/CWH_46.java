package com.javacource;
class base1{
    protected int i = 100;
    base1(){
        System.out.println("I am a Constructor ");
    }
    base1(int a){
        System.out.println("I am an Overloaded constructor having value : "+a);
    }
}
class derive2 extends base1{
    derive2(){
        super(4);
        System.out.println("i am de" + i + "rive class constructor");
    }
    derive2(int a,int b){
        super(a);
        System.out.println("I am an Overloaded constructor having value of a : "+a + "and value of b is : "+b);
    }

}
public class CWH_46 {
    public static void main(String[] args) {
//        base1 b = new base1();
        //derive2 d = new derive2();
        derive2 d1 = new derive2(4,3);

    }
}
