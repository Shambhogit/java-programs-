package com.practice;


abstract class Vehicle {
    int wheels;
    long price;

    public void NumOfWheel(){
        wheels = 4;
        System.out.println("Number of Wheel is : " + wheels);
    }
    abstract public void PriceOfVehicle();
}
class NewCar extends Vehicle{
    public void PriceOfVehicle(){
        price = 4000000;
        System.out.println("Price is "+price);
    }
    public void carName(){
        String name = "Shantro";
        System.out.println("Name of car is : "+name);
    }

}
public class practice2_11_01 {
    public static void main(String[] args){
        NewCar n1 = new NewCar();
        n1.NumOfWheel();
        n1.carName();
        n1.PriceOfVehicle();
    }
}
