package com.jprmanual;
/* Demonstrate use of throw and throws clause
 */
class myExceptionSumZero extends Exception{
    @Override
    public String toString() {
        return "myExceptionSumZero";
    }

    @Override
    public String getMessage() {
        return "This is myExceptionSumZero message";
    }
}
public class prac26_27a {
    static void sum (int a , int b) throws myExceptionSumZero{
        if(a+b == 0){
            throw new myExceptionSumZero();
        }
        else{
            System.out.println("Sum is : "+(a+b));
        }
    }
    public static void main(String[] args) {
        try {
            sum(0,0);
        }
        catch (myExceptionSumZero e){
            System.out.println(e.toString());
//            e.printStackTrace();
        }
    }
}
