package com.practice;

import java.util.Arrays;

public class CCQ_1 {
    public static void main(String[] args) {
        int [] b = {1,2,3,4,5,6,7};
        int n = b.length;
        sumArr(b,n);
    }
    static void sumArr(int []arr,int n){
        int []sum = new int[n];
        for(int i = 0;i<n;i++){
            int a = 0;
            for(int j = 0;j<=i;j++){
                a +=arr[j];
            }
            sum[i] = a;
        }
        System.out.println(Arrays.toString(sum));
    }
}
