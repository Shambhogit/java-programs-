package com.DSA2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {43,54,23,11,65,43};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr)
    {
        for(int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int [] arr,int start , int end){
        int max = start;
        for (int i = start;i<=end;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
//    public static void main(String[] args) {
//        int [] arr = new int [10];
//        System.out.println("enter the size of array : ");
//        Scanner s= new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println("Enter array element ");
//        for(int i = 0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        int element = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i]>element){
//                element = arr[i];
//            }
//        }
//        System.out.println("Maximam element is : "+element);
//        int min = 0;
//        for (int i = 0;i<n;i++){
//            if(arr[i]<element){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);
//    }
}
