package com.javacource;
class NegativeRadiusException extends Exception{
    public String toString(){
        return "NegativeRadiusException";
    }
    @Override
    public String getMessage() {
        return "NegativeRadiusException";
    }
}
public class cwh_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result  = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        try {
            double area = area(-1);
            System.out.println(area);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
