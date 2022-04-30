package com.PracticeDsa;
import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){
        LinearSearch l1 = new LinearSearch();
        l1.getArray();
        l1.printArray();
        l1.linearSearch();
    }
    Scanner s = new Scanner(System.in);
    int n;
    int [] arr = new int[100];
    void getArray(){
        System.out.println("Enter the size of Array");
        n = s.nextInt();
        System.out.println("Enter the element in array ");
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    void printArray(){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
    }
    void linearSearch(){
        int key ;
        System.out.println("\nEnter the element to find ");
        key = s.nextInt();
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
                System.out.printf("Element %d is found at index %d",key,i);
                return;
            }
        }
        System.out.println("element not found");
    }
}
