package com.practice;
class Cylinder{
    float hight;
    float radius;
    public Cylinder(){
        hight = 55.45f;
        radius = 12.43f;
    }
    public Cylinder(float h,float r){
        hight = h;
        radius = r;
    }
    public void setHight(int h){
        hight = h;
    }
    public float getHight(){
        return hight;
    }
    public void setRadius(float r){
        radius = r;
    }
    public float getRadius(){
        return radius;
    }
    public void areaOfCylinder(){
        float pi = 3.14f;
        float a = (2*pi*radius*hight)+(2*pi*radius*radius);
        System.out.println("Surface area of Cylinder is : "+a);
        float v = 2*pi*radius*hight;
        System.out.println("Volume of Cylinder is : "+v);
    }
}
public class practice10 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3.42f,2.3f);
        c1.areaOfCylinder();
    }
}
