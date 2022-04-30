package com.DSA2;

import java.util.Scanner;

public class DLL {
    Scanner s = new Scanner(System.in);
    private class node {
        int data ;
        node next;
        node prev;
        public node(int data) {
            this.data = data;
        }
    }
    node head = null;
    node tail = null;
    int size;

    public DLL(){
        this.size  = 0;
    }

    public void createDLL(int data){
        node new_node = new node(data);
        if(head==null){
            head=tail=new_node;
        }
        else {
            head.prev=new_node;
            new_node.next=head;
            head = new_node;
            new_node.prev=null;
        }
        size++;
    }
    private void Display(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
    private void ReTraversal(){
        node temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        }
        System.out.print("END\n");
    }
    private void insertFirst(int data){
        node new_node = new node(data);
        if(head==null){
            head=tail=new_node;
        }
        else {
            head.prev=new_node;
            new_node.next=head;
            head = new_node;
            new_node.prev=null;
        }
        size++;

    }
    private void insertEnd(int data){
        node new_node = new node(data);
        new_node.next=tail.next;
        tail.next=new_node;
        new_node.prev=tail;
        tail=new_node;
        size++;
    }
    private void insertAtIndex(int data,int index){
        node new_node = new node(data);
        node temp =head;

        for(int i = 1;i<index;i++){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next.prev=new_node;
        temp.next=new_node;
        new_node.prev=temp;
        size++;
    }
    private void insertion(){
        int choice ,data,n;
        do {
            System.out.println("\n1.InsertAtFirst\n2.InsertAtEnd\n3.InsertAtIndex");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data : ");
                    data = s.nextInt();
                    insertFirst(data);
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                case 2:
                    System.out.println("Enter data : ");
                    data = s.nextInt();
                    insertEnd(data);
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                case 3:
                    System.out.println("Enter data : ");
                    data = s.nextInt();
                    System.out.println("Enter index : ");
                    int index = s.nextInt();
                    insertAtIndex(data, index);
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                default:
                    System.out.println("enter valid choice !!!");

            }
            System.out.println("Do you want to insert more Data press 1");
            n = s.nextInt();
        }while (n==1);
    }
    private void DeletionAtFirst(){
        head.next.prev=head.prev;
        head=head.next;
        size--;
    }
    private void DeletionAtEnd(){
        tail.prev.next=tail.next;
        tail=tail.prev;
        size--;
    }
    private void DeletionAtIndex(int index){
        node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size--;
    }
    private void Deletion(){
        int choice ,data,n;
        do {
            System.out.println("\n1.InsertAtFirst\n2.InsertAtEnd\n3.InsertAtIndex");
            choice = s.nextInt();

            switch (choice) {
                case 1:

                    DeletionAtFirst();
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                case 2:
                    DeletionAtEnd();
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                case 3:
                    System.out.println("Enter index : ");
                    int index = s.nextInt();
                    DeletionAtIndex(index);
                    System.out.println("Traversing from head");
                    Display();
                    System.out.println("Traversing from tail");
                    ReTraversal();
                    break;
                default:
                    System.out.println("enter valid choice !!!");

            }
            System.out.println("Do you want to insert more Data press 1");
            n = s.nextInt();
        }while (n==1);

    }
    public void DLLOperation() {
        int n;
        do {
            System.out.println("Choose Operation You Want to Do on D.LinkList\n1.Insertion\n2.Deletion\n3.Display Link List \n4.EXIT");
            n = s.nextInt();
            switch (n) {
                case 1:
                    insertion();
                    break;
                case 2:
                    Deletion();
                    break;
                case 3:
                    int ch;
                    System.out.println("\n1.Display in Forward Direction \n2.Display in Reverse Direction");
                    ch = s.nextInt();
                    switch (ch) {
                        case 1:
                            Display();
                            break;
                        case 2:
                            ReTraversal();
                            break;
                        default:
                            System.out.println("Enter valid Choice");
                    }
                case 4:
                    break;
                default:
                    System.out.println("Enter Valid Choice !!!");
                    break;
            }
        }while (n!=4);
    }
}
