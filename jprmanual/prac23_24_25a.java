package com.jprmanual;

public class prac23_24_25a {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Division is : "+c);
        }
        catch (Exception e){
            System.out.println("Exception is " +e);
        }
        finally{
            System.out.println("This is Finally block");
        }
    }
}
