package com.PracticeDsa;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch b1 = new BinarySearch();
        b1.getArray();
        b1.display();
        b1.binarySearch();

    }
    int [] arr = new int[100];
    int n;
    Scanner s = new Scanner(System.in);
    void getArray ()
    {
        System.out.println("Enter the size of Array ");
        n = s.nextInt();
        System.out.println("Enter the element in Array ");
        for(int i = 0; i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    void display(){
        System.out.println("Elements in array is ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    void binarySearch(){
        System.out.println("Enter the element to find");
        int key = s.nextInt();
        int start = 0;
        int end = n;
        int mid = (start+end)/2;
        for(int i = 0;i<n/2;i++){
            if(key==arr[mid]){
                System.out.println("Element found at index "+mid);
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
