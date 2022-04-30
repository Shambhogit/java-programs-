package com.jprmanual;
//Write a program to implement different types of constructors to perform addition of complex numbers
class Test1{
    int a,b;
    public Test1(){   //default constructor
        a = 0;
        b = 0;
    }
    public Test1(int x,int y){  // parameterized constructor
        a = x;
        b = y;
    }
    public Test1(Test1 t1,Test1 t2){  //copy constructor
        int c = t1.a + t2.a;
        int d = t1.b + t2.b;
        System.out.println(c +" + "+d+"i");
    }

    public void printComplexNumber(){
        System.out.println(a +" + "+b+"i");
    }

}
public class Prac_10b {
    public static void main(String[] args) {
        Test1 t1 = new Test1(4,6);
        Test1 t2 = new Test1(8,2);
        t1.printComplexNumber();
        t2.printComplexNumber();
        System.out.println("Addition of Complex number is");
        Test1 t3 = new Test1(t1,t2);
    }
}
