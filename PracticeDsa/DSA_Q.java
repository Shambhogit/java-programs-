package com.PracticeDsa;

import java.util.Arrays;

public class DSA_Q {
    public static String Median(int []arr1,int []arr2){
        int []arr3 = new int[arr1.length+arr2.length];
        int i = 0,j=0 , k =0;
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        String a = Arrays.toString(arr3);
        return a;
    }
    public static void main(String[] args) {
        int []a1 = {44,32,26,1,5,65,4,44};
        int []a2 = {6,4,1,23,62};
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println( Median(a1,a2));
    }
}
