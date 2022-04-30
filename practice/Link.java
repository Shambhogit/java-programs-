package com.practice;

public class Link {
    node head;
    node tail;
    int size;

    public void insertFirst(int data){
        node new_node = new node(data);
        if(head==null){
            head=tail=new_node;
            size++;

        }
        else{
            new_node.next=head;
            head=new_node;
            size++;
        }
    }
    public void insertAtEnd(int data){
        node new_node = new node(data);
        if(tail==null){
            insertFirst(data);
            size++;
            return;
        }
            tail.next=new_node;
            tail=new_node;
            size++;
            return;

    }
    public void insertInBetween(int data,int index){
        node new_node = new node(data);
        if(index==0){
            insertFirst(data);
        }
        else if(index==size){
            insertAtEnd(data);
        }
        else{
            node temp = head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }

    }
    public void deletionAtFirst(){
        head = head.next;
        size--;
    }
    public void deletionAtEnd(){
        node temp = head;
        for(int i=0;i<size-1;i++){
            temp =temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void display(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void deletionInBetween(int index){
        if(index==0){
            deletionAtFirst();
            size--;
            return;
        }
        if(index==size-1){
            deletionAtEnd();
            size--;
            return;
        }
        node temp = head;
        node tempNext = temp.next;
        for(int i=1;i<index-1;i++){
            temp=tempNext;
            tempNext=tempNext.next;
        }
        temp.next=tempNext.next;
    }

    public Link() {
        this.size = 0;
    }

    private class node{
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
        }

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }
    }
}
