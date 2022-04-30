package com.CWH_practiceSet;
class MaxIndexReach extends Exception{
    public String toString(){
        return "MaxIndexTeach";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class c14_p5 {
    public static void printArray(int []arr) throws MaxIndexReach{
        int i = 0;
        while (i< 10){
            if(i == arr.length){
                throw new MaxIndexReach();
            }
            System.out.println(arr[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        int [] a = {3,54,23,11,65,5,2};
        try {
            printArray(a);
        }
        catch (MaxIndexReach e){
            System.out.println("Error occur");
        }

    }
}
