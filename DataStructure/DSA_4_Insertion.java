package com.DataStructure;

import java.util.Scanner;

class node{
    int data;
    node next;
    public node(){}
    public node(int data){
        this.data=data;
        next=null;
    }
    node head = null;
    public void createLL(){
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter data : ");

            data = s.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("\n1.Insertion at begining \n2.Insertion at End \n3.Insertion at middile");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the position to insert Node");
                        int pos = s.nextInt();
                        temp = head;
                        for (int i = 1; i < pos; i++) {
                            temp = temp.next;
                        }
                        new_node.next = temp.next;
                        temp.next = new_node;
                    default:
                        System.out.println("Enter valide choise");
                }
            }
            System.out.println("do you want to insert data if yes press 1 ");
            n = s.nextInt();
        }while (n==1);

    }
    public void printLL(){
        node temp = head;
        while (temp!=null){
            System.out.println(temp.data+"\t");
            temp=temp.next;
        }
    }
}

public class DSA_4_Insertion {
    public static void main(String[] args) {
        node n1 = new node();
        int ch;
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("Enter Choice\n1.insert data\n2.Display LinkedList\n3.exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    n1.createLL();
                    break;
                case 2:
                    n1.printLL();
                case 3:
                    break;
                default:
                    System.out.println("Enter valid Choice");
            }
        } while (ch != 3);
    }
}