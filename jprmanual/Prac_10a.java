package com.jprmanual;
// Demonstrate use of at least two types of constructors
class Test{
    int a,b;
    public Test(){   //default constructor
        a = 0;
        b = 0;
    }
    public Test(int x,int y){  // parameterized constructor
        a = x;
        b = y;
    }

    public void printValue(){
        System.out.println("Observe Difference ");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }

}
public class Prac_10a {
    public static void main(String[] args) {
              Test t1 = new Test();
              Test t2 = new Test(4,3);
              t1.printValue();
              t2.printValue();
    }
}
