package com.javacource;
abstract class Base2{

    public Base2(){
        System.out.println("i am Consturctor of base");
    }
    public void sayHallo(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends Base2{
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class CWH_53 {
    public static void main(String[] args) {
        child c1 = new child();
        c1.greet();
    }
}
