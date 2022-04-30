package com.PracticeDsa;

public class linklist0902 {
    private class node{
        public int data;
        public node next;
        public node(int data) {
            this.data = data;
        }
    }
    node head;
    node tail;
    int size;

    public linklist0902() {
        this.size = 0;
    }
    public void insertFirst(int data){
        node new_node = new node(data);
        if (head == null) {
            head = tail= new_node;
        }
        else{
            new_node.next=head;
            head= new_node;
        }
        size++;
    }
    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("END\n");
        System.out.println(tail.data);
    }
    public void insertEnd(int data){
        node new_node = new node(data);
        tail.next=new_node;
        tail=new_node;
        size++;
    }
    public void insertAtIndex(int data ,int index){

        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertEnd(data);
            return;
        }
        if(index>size){
            System.out.println("Index is out of range");
            return;
        }
        if(index<0){
            System.out.println("Index is out of range");
        }
        else{
            node new_node = new node(data);
            node temp = head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            new_node.next = temp.next;
            temp.next=new_node;
            size++;
        }
    }
    public void deletionFirst(){
        head=head.next;
        size--;
    }
    public void deletionEnd(){
        node temp= head;
        for(int i=1;i<size-1;i++){
            temp= temp.next;
        }
        temp.next=tail.next;
        tail=temp;
        size--;
    }
}
