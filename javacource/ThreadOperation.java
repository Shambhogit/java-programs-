package com.javacource;

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program started");
        int x = 40+50;
        System.out.println("sum is "+x);

        //currentThread() return object of thread which is currently running
        Thread t = Thread.currentThread();

        //getName() use to get name of Thread
        System.out.println("name of thread is : "+t.getName());

        //setName() use to set name of Thread
        t.setName("Shambho");
        System.out.println("name of thread is : "+t.getName());

        //sleep(milsec) is use to stop program for given time
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }

        //getId() is use to get id of thread object which is currently running;
        System.out.println(t.getId());
        System.out.println("program ended...");
    }
}
