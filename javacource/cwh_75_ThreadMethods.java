package com.javacource;
class thr1 extends Thread{

    public void run(){
        int i = 0;
     while(true){
         System.out.println("hello thr1 ");
         try{
             Thread.sleep(1000);
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
      }
    }
}
class thr2 extends Thread{

    public void run(){
        int i = 1;
        while(i<=100){
            System.out.println("hello thr2");
            i++;
        }
    }
}
public class cwh_75_ThreadMethods {
    public static void main(String[] args) {
        thr1 t1 = new thr1();
        thr2 t2 = new thr2();

        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
