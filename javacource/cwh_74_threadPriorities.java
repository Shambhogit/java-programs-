package com.javacource;
class thread1 extends Thread{
    thread1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println(this.getName());
        }
    }
}
public class cwh_74_threadPriorities {
    public static void main(String[] args) {
        thread1 t1 = new thread1("shambho1 min priority");
        thread1 t2 = new thread1("shambho2");
        thread1 t3 = new thread1("shambho3");
        thread1 t4 = new thread1("shambho4");
        thread1 t5 = new thread1("shambho5 most priority");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
