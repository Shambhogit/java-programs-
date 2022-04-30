package com.javacource;

class myThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<3000) {
            System.out.println("i am thread1 not a threat1");
            i++;
        }
    }
}

class myThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<3000) {
            System.out.println("i am thread2 not a threat2");
            i++;
        }
    }
}
public class cwh_71_runnable {
    public static void main(String[] args) {
        myThreadRunnable1 t1 = new myThreadRunnable1();
        Thread m1 = new Thread(t1);

        myThreadRunnable2 t2 = new myThreadRunnable2();
        Thread m2 = new Thread(t2);

        m1.start();
        m2.start();
    }
}
