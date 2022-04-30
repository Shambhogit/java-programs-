package com.PracticeDsa;
import java.util.Scanner;
class Array{
    protected int[] arr = new int [100];
    protected int n,i;
    protected Scanner sc = new Scanner(System.in);
    public void getArray() {
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        System.out.println("Enter the elements in array");
        for(i = 0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void Display() {
        System.out.println("\npresent elements in array is ");
        for(i = 0; i<n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    public void BSort(){
        for(int i = 0;i<n;i++){
            for(int j = 1; j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public void ISort(){
        for(i=0;i<n;i++){
            for(int j = i+1;j>=0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    public void SSort(){
        for(i = 0;i<n;i++){
            int last = n-i-1;
            int max = 0;
            for(int j = 0 ;j<n-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp = arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }
}
public class Sorting {
    public static void main(String[] args) {
        Array a = new Array();
        a.getArray();
        a.Display();
        a.BSort();

    }
}
