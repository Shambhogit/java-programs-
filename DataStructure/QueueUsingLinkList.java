package com.DataStructure;

public class QueueUsingLinkList {
     class node {
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    node front = null;
    node rare = null;
    int size ;
    public QueueUsingLinkList(){
        this.size=0;
    }
    public void enqueue(int data){
        node new_node = new node(data);
        if(front==null){
            front = rare = new_node;
        }
        else {
            rare.next=new_node;
            rare=new_node;
        }
        size++;
    }
    public void dequeue(){
        if(front == null && rare == null){
            System.out.println("Queue is empty");
        }
        else {
            front = front.next;
            size--;
        }

    }
    public void display(){
       node temp = front;
        System.out.print("Front <- ");
      while (temp!=null) {
          System.out.print(temp.data + " <- ");
          temp = temp.next;
      }
        System.out.print("Rare\n");
    }
}
