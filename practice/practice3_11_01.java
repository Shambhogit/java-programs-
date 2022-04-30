package com.practice;
class TowWheeler{
    public void TwoWheelerName(){
        System.out.println("Name of Two Wheeler is Splender");
    }
}
class MoterCycle extends TowWheeler{
    public void PriceOfMoterCycle(){
      int price = 40000;
        System.out.println("Price is : "+price);
    }
}
public class practice3_11_01 {
    public static void main(String[] args) {
        TowWheeler m1 = new MoterCycle();
        m1.TwoWheelerName();
    }
}
