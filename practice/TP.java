package com.practice;

public class TP {
    public static void main(String[] args) {
        String [] name = {"shambho","mandar","namrata","abhi","prathamesh"};
        int size = name.length;
        sortstr(name,size);
    }
    static void sortstr(String []arr,int n){
        for(int i = 0;i<n;i++){
            for(int j = 1 ;j<n-i;j++){
                if(arr[j].charAt(0) < arr[j-1].charAt(0)){
                    String temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i =  0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}
