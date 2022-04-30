package com.practice;

public class practice_17_01_LL {
    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size ;

    public practice_17_01_LL() {
        this.size = 0;
    }

    public void insertionFirst(int data){
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
    public void insertionEnd(int data){
        if(head==null){
            insertionFirst(data);
        }
        else {
            Node new_node = new Node(data);
            tail.next=new_node;
            tail=new_node;
            size++;
        }
    }
    public void insertionAtIndex(int data,int index){
        if(index==1){
            insertionFirst(data);
        }
        else if(index==size){
            insertionEnd(data);
        }
        else{
            Node new_node = new Node(data);
            Node temp = head;
            for (int i = 1;i<index-1;i++){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
            size++;
        }
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
    public void deletionFirst(){
        head=head.next;
    }

    public static void main(String[] args) {
        practice_17_01_LL ll = new practice_17_01_LL();
        ll.insertionEnd(43);
        ll.insertionFirst(54);
        ll.insertionFirst(76);
        ll.insertionFirst(11);
        ll.insertionEnd(100);
        ll.display();
        ll.insertionAtIndex(44,4);
        System.out.println(ll.size);
        ll.insertionAtIndex(200,6);
//        ll.deletionFirst();
        ll.display();
    }
}
