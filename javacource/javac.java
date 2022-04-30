package com.javacource;
class sj extends Thread{
    public void run(){
        for(int i = 0 ;i<10000;i++){
            if(i%2==0){
                System.out.println("Even Number is:"+i);
            }
        }
    }
}
class sr extends Thread {
    public void run(){
        for(int i = 0 ;i<10000;i++){
            if(i%2!=0){
                System.out.println("Odd Number is:"+i);
            }
        }
    }
}
public class javac {
    public static void main(String[] args){
        sj s1 = new sj();
        sr s2 = new sr();

        s1.start();
        s2.start();

    }
}
