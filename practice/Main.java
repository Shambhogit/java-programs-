package com.practice;

public class Main {
    public static void main(String[] args) {
        Link l1 = new Link();
        l1.insertFirst(30);
        l1.insertFirst(44);
        l1.insertFirst(55);
        l1.display();
        l1.insertAtEnd(77);
        l1.display();
        l1.insertInBetween(32,3);
        l1.display();
        l1.deletionAtFirst();
        l1.display();
        l1.deletionAtEnd();
        l1.display();
        l1.insertAtEnd(98);
        l1.display();
        l1.deletionInBetween(1);
        l1.display();


    }
}
