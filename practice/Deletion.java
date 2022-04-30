package com.practice;

import java.util.Scanner;

class Node{
    int data ;
    Node next;
    Scanner s = new Scanner(System.in);
    public Node (){}
    public Node (int data){
        this.data=data;
        next = null;
    }
    Node head = null;
    void getLinkList(){

        int n;
        do {
            System.out.println("Enter data : ");
            data = s.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to insert more data press 1 ");
            n = s.nextInt();
        }while (n==1);
    }
    void printLinkList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void DeleteNode(){
        int data,n,m,p;
        Scanner sc=new Scanner(System.in);
        do{
            if(head == null){
                System.out.println("Link List is Empty");
            }
            else {
                System.out.println("\n1.Deletion at Beginning\n2.Deletion at end\n3.deletion at any position\n4.Exit");
                m=sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter Position of Node to delete");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 1; i < p - 1; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;

                }
            }
            System.out.println("do you Wnat to delete more if yes press 1");
            n=sc.nextInt();
        }while (n==1);
    }
}
public class Deletion {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.getLinkList();
        n1.printLinkList();
        n1.DeleteNode();
        n1.printLinkList();
    }
}
