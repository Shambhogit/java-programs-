package com.jprmanual;
/*Demonstrate the use of interfaces to implement the concept of multiple inheritance*/
interface AnimalEat{
    void eat();
}
interface AnimalTravel {
    void travel();
}
class Animal implements AnimalEat,AnimalTravel{
    public void animalName(){
        System.out.println("Name of Animal is Dog");
    }
    public void eat(){
        System.out.println("Dog is Eating");
    }
    public void travel(){
        System.out.println("Dog is Travelling");
    }
}
public class Prac_19a {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.animalName();
        a.eat();
        a.travel();
    }
}
