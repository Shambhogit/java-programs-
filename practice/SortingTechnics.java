package com.practice;

import java.util.Arrays;

public class SortingTechnics {
    public static void main(String[] args){
        int [] arr = {32,54,11,243,47,67,45,76,33,3};
//        selectionSort(arr);
//        System.out.println(maxElementIndex(arr,0,arr.length));
//        bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int [] arr){
        for(int i = 1 ; i<arr.length;i++){
            for (int j=i ;j>0;j--){
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }
            }
        }

    }
    static void selectionSort(int [] arr){
        for(int i = 1;i<=arr.length;i++){
            int last = arr.length-i;
            int maxInd=maxElementIndex(arr,0,arr.length-i);
            swap(arr,maxInd,last);
        }
    }
    static int maxElementIndex(int [] arr, int start , int end){
        int temp = start;
        for(int i = start ;i<end;i++){
            if(arr[temp]<arr[i]){
                temp=i;
            }
        }
        return temp;
    }
    static void bubbleSort(int [] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
