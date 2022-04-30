package com.PracticeDsa;

public class ll {
    private class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size;

    public ll() {
        this.size = 0;
    }

    public void create(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=tail=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
        size++;
    }
    public void display(){
        Node temp = head ;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
    public void deleteFirst(){
        head=head.next;
        size--;
    }
    public void deleteEnd(){
        Node temp = head;
        for(int i = 1; i<size-1;i++){
            temp=temp.next;
        }
        temp.next=tail.next;
        tail=temp;
    }

}
