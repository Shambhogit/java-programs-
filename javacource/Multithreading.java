package com.javacource;
//creating thread using Runnable Interface
class MyThread implements Runnable{
    public void run(){
        //task for thread
        for(int i = 0;i<=10;i++){
            System.out.println("value of i is "+ i);
            try {
            Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

//Creating thread using Thread class
class MyThread1 extends Thread{
    public void run(){
        for(int i = 100;i>0;i--){
            System.out.println("value of i is "+i);
            try {
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);

        MyThread1 t2 = new MyThread1();

        thr.start();
        t2.start();
    }
}
