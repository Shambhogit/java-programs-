package com.PracticeDsa;
class link1{
    private class Node{
        int data;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertFirst(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = tail = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("END\n");
        System.out.println(head.data);
    }

    public void revers(){
        Node temp = head;
        Node tempNext = temp.next;
        Node ftn = null;

        while(temp.next!=null){
                head.next=null;
                tempNext.next=temp;
                ftn = tempNext;
                temp =tempNext;
                tempNext=tempNext.next;
        }
    }
}
public class list {
    public static void main(String[] args) {
       link1 ll = new link1();
       ll.insertFirst(43);
       ll.insertFirst(64);
       ll.insertFirst(23);
       ll.insertFirst(87);
       ll.insertFirst(26);
       ll.insertFirst(20);
       ll.display();
       ll.revers();
       ll.display();

    }
}
