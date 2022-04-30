package com.PracticeDsa;
class linklist{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size;

    public linklist(){
        this.size = 0;
    }
    public void insertFirst(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = tail = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
}
public class link {
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.insertFirst(21);
        ll.insertFirst(42);
        ll.insertFirst(12);
        ll.insertFirst(77);
        ll.insertFirst(45);
        ll.insertFirst(23);
        ll.insertFirst(89);
        ll.display();
    }
}
