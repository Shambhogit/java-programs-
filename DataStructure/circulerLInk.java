package com.DataStructure;

import java.util.Scanner;

public class circulerLInk {
    static class node{
        int data;
        node next;
        node (int data){
            this.data=data;
            this.next=null;
        }
    }
    node head = null;
    node tail = null;
    public void insertion(){
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter data: ");
            int data = s.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
            System.out.println("Do you want to insert more data press 1");
            n=s.nextInt();
        }while (n==1);
    }
    public void travers(){
        node temp = head;
        do{
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("END");
    }
    public static void main(String[]  args){
        circulerLInk cll = new circulerLInk();
        cll.insertion();
        cll.travers();
    }
}
