package com.DataStructure;

import java.util.Scanner;

public class DSA_3 {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head = null;
    public void creation(){
        int data,n;
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.print("Enter data : ");
            data = s1.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
                new_node.next = null;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to add data ? if Yes Press 1 ");
             n = s1.nextInt();
        }
        while (n==1);
    }
    public void traversal(){
        node temp = head;
        if (head == null){
            System.out.println("no Data Avalible");
        }
        else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DSA_3 a1 = new DSA_3();
        a1.creation();
        a1.traversal();
    }
}
