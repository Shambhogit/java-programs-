package com.practice;

import java.util.Scanner;

class node {
    int data;
    node next;
    node(){}
    node(int data){
        this.data=data;
        next=null;
    }
    node head = null;
    public void createLL(){
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter data");
            int data = s.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do u want to insert more data press 1 ");
            n = s.nextInt();
        }while (n==1);
    }
    public void printLL(){
       node temp = head;
       while (temp != null) {
           System.out.print(temp.data + "\t");
           temp = temp.next;
       }
    }

}
public class DSA_practice2 {
    public static void main(String[] args){
        node s1 = new node();
        s1.createLL();
        s1.printLL();
    }
}
