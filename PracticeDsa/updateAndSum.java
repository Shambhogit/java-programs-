package com.PracticeDsa;

public class updateAndSum {
    public static void main (String[] args){

    }
    static void sum(int []arr ,int data,int index){
        arr[index-1]=data;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Sum of array after update : "+sum);
    }
}
