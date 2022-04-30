package com.practice;

import java.util.Arrays;

public class CCQ_2 {
    public static void main(String[] args) {
        int []arr ={3,4,5,2};
        int n = arr.length;
        System.out.println(max(arr,n));
    }
    static int max(int []arr,int n){
        Arrays.sort(arr);
        return ((arr[n-1]-1)*(arr[n-2]-1));
    }
}
