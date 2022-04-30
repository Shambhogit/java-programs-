package com.practice;

public class practice_18_01_binary {
    public static void main(String[] args){
        int [] arr = {4,55,65,77,88,97,99,100,234,555,676,787,888,999,1000};
        int element =1000 ;
        binarySearch(arr,element);
        System.out.println(arr.length);
    }
    static void binarySearch(int [] arr,int key){
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        for(int i = 0;i<arr.length/2;i++){
            if(key==arr[mid]){
                System.out.println("element found at " +(mid+1)+" index");
                return;
            }
            else if(key<arr[mid]){
                end=mid;
                mid=(start+end)/2;
            }
            else if(key>arr[mid]){
                start=mid;
                mid=(start+end)/2;
            }
        }
    }
}
