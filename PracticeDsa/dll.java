package com.PracticeDsa;

public class dll {
    private class node {
        int data ;
        node prev ;
        node next;

        public node(int data) {
            this.data = data;
        }
    }
    node head = null;
    node tail = null;
    int size ;

    public dll() {
        this.size = 0;
    }
    public void insertFirst(int data){
        node new_node  = new node(data);
        if(head==null){
            head=tail=new_node;
        }
        else {
            head.prev=new_node;
            new_node.next=head;
            head=new_node;
        }
        size++;
    }
    public void insertEnd(int data){
        if(tail==null){
            insertFirst(data);
        }
        else {
            node new_node = new node(data);
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
            size++;
        }
    }
    public void insertAtIndex(int data , int index){
        node new_node=new node(data);
        node temp = head ;
        if(index==1){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertEnd(data);
        }
        else {
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next.prev = new_node;
            new_node.next = temp.next;
            temp.next = new_node;
            new_node.prev = temp;
            size++;
        }
    }
    public void deletionFirst(){
        head.next.prev=head.prev;
        head=head.next;
    }

    public void Display(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
}
