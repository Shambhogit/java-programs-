package com.PracticeDsa.ArrayOpration;

import com.sun.security.jgss.GSSUtil;

public class UpdateArray extends Array{
    public void replaceOne(){
        System.out.println("\nEnter the data to Replace");
        int data = sc.nextInt();
        System.out.println("Enter data to replace with");
        int data_replace = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(arr[i] == data){
                arr[i] = data_replace;
                printArray();
                return;
            }
        }
        System.out.println("NO Data to replace");
    }
    public void replaceAll(){
        int count = 0;
        System.out.println("\nEnter the data to Replace");
        int data = sc.nextInt();
        System.out.println("Enter data to replace with");
        int data_replace = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(arr[i] == data){
                arr[i] = data_replace;
                count++;
            }
        }
        printArray();
        if(count>1){
            System.out.println("\n" +count + " Indexes are updated");
        }
        else {
            System.out.println("NO Data to replace");
        }
    }
    public void replaceWithIndex(){
        System.out.println("Enter the index to replace");
        int index = sc.nextInt();
        System.out.println("Enter the data to replace");
        int data = sc.nextInt();
        arr[index] = data;
        printArray();
    }
    public void replaceLastValue(){
        System.out.println("\nEnter the data to Replace");
        int data = sc.nextInt();
        System.out.println("Enter data to replace with");
        int data_replace = sc.nextInt();
        for(int i = n-1;i>=0;i--){
            if(arr[i] == data){
                arr[i] = data_replace;
                printArray();
                return;
            }
        }
        System.out.println("NO Data to replace");
    }
}
