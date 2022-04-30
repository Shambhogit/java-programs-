package com.CWH_practiceSet;
//Write a java progrma to demonstrate sysntax logical and runtime errors
class MaxIndexReached extends Exception{
    public String toString(){
        return "MaxIndexReached";
    }
}
public class c14_p1 {
    public static void main(String[] args) {
        int [] arr = {43,2,33,54,1,76,4};
        for(int i = 0;i<10;i++){
            if(i==arr.length){
                try {
                    throw new MaxIndexReached();
                }
                catch (MaxIndexReached e){
                    System.out.println(e);
                    break;
                }

            }
//            try {
                System.out.println(arr[i]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//                System.out.println("Error occur");
//                break;

        }
    }
}
