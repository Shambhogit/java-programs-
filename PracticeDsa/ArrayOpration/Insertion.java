package com.PracticeDsa.ArrayOpration;

public class Insertion extends Array {
    public void insertData(){
        int data,index;
        System.out.println("\nEnter the data to Insert");
        data = sc.nextInt();
        System.out.println("Enter the Index on which you want to insert");
        index = sc.nextInt();
        if(index <=n){
            for (int i = n - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = data;
            n++;
        }
        else{
            System.out.println("Index is not Valid ");
        }
        //it will through error after 100 index
//        try {
//            for (int i = n - 1; i >= index; i--) {
//                arr[i + 1] = arr[i];
//            }
//            arr[index] = data;
//            n++;
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("\nIndex is Not valid Exception : "+e);
//        }
    }
}
