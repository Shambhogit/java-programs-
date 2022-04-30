package com.javacource;
class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        int i = 20;
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class cwh_73_threadConstructor {
    public static void main(String[] args) {
        myThr t = new myThr("shambho");
        t.start();
        System.out.println("the id of thread is : "+ t.getId());
        System.out.println("The name of thread is : "+t.getName());
    }
}
