package com.DSA2;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList (){
        this.size = 0;
    }
    public void deletionAtFirst(){
        if(head==null){
            System.out.println("Link list is Empty");
        }
        else{
            head=head.next;
            size--;
        }

    }
    public void deletionAtEnd(){

        Node temp = head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=tail.next;
        tail=temp;
        size--;
    }
    public void deletionAtIndex(int ind){
        Node temp = head;
        Node tempNext=temp.next;
        for(int i=1;i<ind;i++){
            temp=tempNext;
            tempNext=tempNext.next;
        }
        temp.next=tempNext.next;
        size--;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertMid(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }
        Node node  = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;


        public  Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
