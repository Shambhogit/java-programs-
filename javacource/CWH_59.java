package com.javacource;
interface GPS{
    public void OnGPS();
    public void GetLocation();
}
interface Camera{
    public void OnCamera();
    public void ClickPhoto();
}
interface WiFi {
    public void OnWiFi();
    public void OutPassword();
}
class SmartPhone1 implements GPS,Camera,WiFi{
    public void OnGPS(){
        System.out.println("Activate GPS emidiatly");
    }

    @Override
    public void GetLocation() {
        System.out.println("Getting Location Form GPS");
    }

    @Override
    public void ClickPhoto() {
        System.out.println("Clicking Photo");
    }

    @Override
    public void OnCamera() {
        System.out.println("First Turn On Camera");
    }

    @Override
    public void OnWiFi() {
        System.out.println("On WiFi");
    }

    @Override
    public void OutPassword() {
        System.out.println("Password is \"Shambho\"");
    }
}
public class CWH_59 {
    public static void main(String[] args){
        GPS g1 = new SmartPhone1();
        g1.OnGPS();
        g1.GetLocation();

    }
}
