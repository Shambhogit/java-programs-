package com.PracticeDsa;

import java.util.Scanner;

class GetArray{
    public int [] arr = new int [100];
    public int n;
    protected int i,j;
    protected Scanner s = new Scanner(System.in);
    public void getArray(){
        System.out.println("Enter the no of Element in array");
        n=s.nextInt();
        System.out.println("Enter te element " +n+" in array ");
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
    public void printArray(){
        System.out.println("Element in array is ");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    protected void swap (int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
class BubbleSort extends GetArray{
    public void bubble(){
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(j-1,j);
                }
            }
        }
        System.out.println("\nArray after sorting");
        printArray();
    }
}
class selectionSort extends GetArray{
    public void Selection(){
        for(i=1;i<=n;i++){
            int last = n-i;
            int max =0;
            for(j=0;j<=n-i;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            swap(max,last);
        }
        System.out.println("\nElement after sorting");
        printArray();
    }
}
class insertionSort extends GetArray{
    public void insertion(){
        for(i=0;i<n-1;i++){
            for(j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(j,j-1);
                }
                else {
                    break;
                }
            }
        }
        System.out.println("element after sorting");
        printArray();
    }
}
public class SortingTechnics {
    public static void main(String[] args) {
        insertionSort b1 = new insertionSort();
        b1.getArray();
        b1.printArray();
//        b1.bubble();
        b1.insertion();
    }
}
