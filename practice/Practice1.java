package com.practice;
import java.util.Scanner;
class car{
    int price;
    String name;
    String colour;
    String brand;
    Scanner s1 = new Scanner(System.in);

    public void getCar(){
        System.out.println("Enter Name of car : ");
        name = s1.nextLine();
        System.out.println("Enter Brand of car : ");
        brand = s1.nextLine();
        System.out.println("Enter Colour of car : ");
        colour = s1.nextLine();
        System.out.println("Enter the Price of car : ");
        price = s1.nextInt();
    }
    public void Display(){
        System.out.println("Name of car is : "+name);
        System.out.println("Brand of car is : "+brand);
        System.out.println("Colour of car is : "+colour);
        System.out.println("Price of car is : "+price);
    }
}
public class Practice1 {
    public static void main(String[] args){
       car c1 = new car();
       int choice,n;
       String s;
       Scanner s1 = new Scanner(System.in);
       do {
           System.out.println("Enter your Choice : \n1.Insert\n2.Display\n3.Search\n4.Exit");
           choice = s1.nextInt();

           switch (choice) {
               case 1:
                   System.out.print("Enter how many data to be inserted : ");
                   n = s1.nextInt();
                   for (int i = 0; i < n; i++) {
                       c1.getCar();
                   }
                   break;
               case 2:
                   System.out.println("enter how many data to be Show ");
                   n = s1.nextInt();
                   for (int i = 0; i < n; i++) {
                       c1.Display();
                   }
                   break;
               case 3:
                   System.out.println("Enter name of car to be search");
                   s = s1.nextLine();

                   while (true) {
                       if (c1.name == s) {
                           c1.Display();
                           break;
                       }
                   }
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Enter valide choice !!!");
           }
       }while (choice!=4);
    }
}
