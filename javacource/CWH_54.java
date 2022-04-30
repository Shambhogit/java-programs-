package com.javacource;
interface Bicycle{
    void applyBreak(boolean a);
    void speedUp(int speed);
}
class Splender implements Bicycle{
    public void applyBreak(boolean a){
        if(a==true){
            System.out.println("Glow Back Light");
        }
        else{
            System.out.println("Dont Glow Back Light ");
        }
    }
    public void speedUp(int speed){
        if(speed<40){
            System.out.println("Speed is Slow");
        }
        else if (speed==40){
            System.out.println("Speed is moderated");
        }
        else if (speed>40 && speed<120){
            System.out.println("speed is high Slow down");
        }
    }
}
public class CWH_54 {
    public static void main(String[] args) {
        Splender s1 = new Splender();
        s1.applyBreak(true);
        s1.speedUp(66);
    }
}
