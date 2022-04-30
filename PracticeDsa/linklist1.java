package com.PracticeDsa;

public class linklist1 {
    private class node{
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }
    node head = null;
    node tail = null;
    int size ;

    public linklist1() {
        this.size = 0;
    }
    public void insertFirst(int data){
        node new_node = new node(data);
        if(head==null){
            head = tail = new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
        size++;
    }
    public void insertEnd(int data){
        node new_node=new node(data);
        if(head==null){
            insertFirst(data);
        }
        else {
            tail.next = new_node;
            tail= new_node;
        }
        size++;
    }

    public void insetAtIndex(int data,int index){
        node new_node=new node(data);
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertEnd(data);
        }
        else{
            node temp = head;
            for(int i=1; i<index-1;i++){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
        size++;
    }

    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
}
