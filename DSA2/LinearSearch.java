package com.DSA2;

public class LinearSearch {
    public static void main(String[] args) {
      int [] num = {43,42,21,54,64,34,23,56,33};
      int target = 6;
      System.out.println(linear(num,target));

    }
    static int linear(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
