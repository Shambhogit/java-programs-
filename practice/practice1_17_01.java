package com.practice;

public class practice1_17_01 {
    static boolean arrayElement(int [] arr){
        for(int i = 0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = { 43,23,12,54,2,44,44};
//        System.out.println(arr.length);
        System.out.println(arrayElement(arr));
    }
}
