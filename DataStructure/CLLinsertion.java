package com.DataStructure;

import java.util.Scanner;

public class CLLinsertion {
    static class node{
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }
    node head = null;
    node tail = null;
    int size;
    public CLLinsertion(){
        this.size= 0;
    }
    Scanner s = new Scanner(System.in);
    public void CreateLL(int data){
       node new_node = new node(data);
        if (head == null) {
            head = tail = new_node;
            new_node.next = head;
        } else {
            new_node.next = head;
            head = new_node;
            tail.next = head;
        }
       size++;
    }
    public void insertionCLL(){
        int data ,n,choice;
        do {
            System.out.println("\n1.Insert At First \n2.Insert At End \n3.Insert at any position ");
            n = s.nextInt();
            System.out.print("Enter data : ");
            data = s.nextInt();
            node new_node = new node(data);
            switch (n) {
                case 1:
                    CreateLL(data);
                    Display();
                    break;
                case 2:
                    tail.next = new_node;
                    tail = new_node;
                    new_node.next = head;
                    size++;
                    Display();
                    break;
                case 3:
                    System.out.println("Enter index At which You want to insert data ");
                    int index = s.nextInt();
                    node temp = head;
                    for (int i = 1; i < index; i++) {
                        temp = temp.next;
                    }
                    new_node.next = temp.next;
                    temp.next = new_node;
                    size++;
                    Display();
                    break;
                default:
                    System.out.println("Enter valid Choice !!!");
            }
            System.out.println("\nDo You want to insert Press 1 ");
            choice = s.nextInt();
        }while (choice==1);
    }
    public void Deletion(){
        int choice,n;
        do {
            System.out.println("\n1.Deletion at first \n2.Deletion at end \n3.deletion at given Position");
            n = s.nextInt();
            switch (n) {
                case 1:
                    head=head.next;
                    tail.next = head;
                    size--;
                    Display();
                    System.out.println("\nSize Of LinkList Is : "+size);
                    System.out.println("\n"+tail.next.data);
                    break;
                case 2:
                    node temp = head;
                    for (int i = 1; i < size - 1; i++) {
                        temp = temp.next;
                    }
                    tail = temp;
                    tail.next = head;
                    size--;
                    Display();
                    System.out.println("\nSize Of LinkList Is : "+size);
                    System.out.println("\n"+tail.next.data);
                    break;
                case 3:
                    int index;
                    System.out.println("Enter index at which you want to do Delete operatin");
                    index = s.nextInt();
                    node temp1 = head;
                    node temp2 = temp1.next;
                    for (int i = 1; i < index-1; i++) {
                        temp1 = temp2;
                        temp2 = temp2.next;
                    }
                    temp1.next = temp2.next;
                    size--;
                    Display();
                    System.out.println("\nSize Of LinkList Is : "+size);
                    System.out.println("\n"+tail.next.data);
                    break;
                default:
                    System.out.println("Enter walid choice ");
            }
            System.out.println("\nDo You Want to delete more press 1");
            choice = s.nextInt();
        }while (choice == 1);
    }
    public void Display(){
        node temp = head;
        for(int i=0;i<size;i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        CLLinsertion l= new CLLinsertion();
        l.CreateLL(44);
        l.CreateLL(22);
        l.CreateLL(12);
        l.CreateLL(76);
        l.CreateLL(95);
        l.CreateLL(76);
        l.CreateLL(88);
        l.CreateLL(32);
        l.CreateLL(31);
        l.CreateLL(11);
        l.CreateLL(2);
        l.Display();
        l.Deletion();
//        System.out.println("\n"+l.size);
//        l.insertionCLL();




    }
}
