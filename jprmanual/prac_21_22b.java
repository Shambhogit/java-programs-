package com.jprmanual;
/*Create three threads and run these threads according to set priority.*/
class myThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<6000){
            System.out.println("I am Thread 1");
            i++;
        }
    }
}
class myThread2 extends Thread {
    public void run(){
        int i = 0;
        while(i<6000){
            System.out.println("I am Thread 2");
            i++;
        }
    }
}
class myThread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<6000){
            System.out.println("I am Thread 3");
            i++;
        }
    }
}
public class prac_21_22b {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
