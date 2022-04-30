package com.javacource;
class myThread1 extends Thread {
    public void run(){
        int i = 0;
        while(i<1000) {
            System.out.println("I am Running Thread1 cooking");
            System.out.println("I am happy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<1000) {
            System.out.println("I am Running Thread2 Chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class cwh_70_multiThreading {
    public static void main(String[] args) {
         myThread1 t1 = new myThread1();
         myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
