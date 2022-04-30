package com.javacource;
class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
public class CWH_47 {
    public static void main(String[] args) {
        EkClass e1 = new EkClass(5);
        System.out.println(e1.getA());
    }
}
