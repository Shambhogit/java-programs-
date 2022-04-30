package com.jprmanual;
import java.util.Scanner;

/*Develop a program to find area of rectangle and circle using interface*/
interface Rectangle {
    public void rectangleArea();
}
interface Circle {
    public void circleArea();
}
class CalculateArea implements Rectangle , Circle{
    Scanner sc = new Scanner(System.in);
    public void rectangleArea(){
        System.out.println("Enter the Height of Rectangle");
        int hi = sc.nextInt();
        System.out.println("Enter the Breadth of Rectangle");
        int br = sc.nextInt();
        System.out.println("Area of Rectangle is "+(hi*br));
    }
    public void circleArea(){
        System.out.println("Enter the Radius of Circle");
        int r = sc.nextInt();
        System.out.println("Area of Circle is "+(Math.PI*r*r));
    }
}
public class prac_19b {
    public static void main(String[] args) {
        CalculateArea a = new CalculateArea();
        a.circleArea();
        a.rectangleArea();
    }
}
