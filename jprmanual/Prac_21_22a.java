package com.jprmanual;
class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            System.out.println("I am Doing Study...");
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<1000;i++) {
            System.out.println("I am watching TV...");
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Prac_21_22a {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
