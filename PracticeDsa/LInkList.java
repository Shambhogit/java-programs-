package com.PracticeDsa;

public class LInkList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node a = null;
    int size ;
    public LInkList() {
        this.size = 0;
    }

    void insertFirst(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=a=new_node;
        }
        else {
            new_node.next=head;
            head=new_node;
        }
        size++;
    }
    void insertLast(int data){
        Node new_node = new Node(data);
        a.next = new_node;
        a=new_node;
        size++;
    }
    void insertAtIndex(int data,int index){
        Node new_node = new Node(data);
        if(index==1){
            insertFirst(data);
            size++;
            return;
        }
        if(index==size){
            insertLast(data);
            size++;
            return;
        }
        Node temp = head;
        for(int i = 1;i<index-1;i++){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
        size++;
    }
    void deleteMid() {
        Node temp = head;
        int cout =0;
        while(temp != null){
            temp = temp.next;
            cout++;
        }
        System.out.println(cout);
        int mid = 0;
            mid = cout/2;
        System.out.println(mid);
        Node el = head;
        for(int i = 1;i<mid ;i++){
            el=el.next;
        }
        System.out.println(el.data);
        el.next=el.next.next;
    }
    void del(int m,int n){
        Node temp = head;
        int cunt = 0;
        while (temp!=null){
            temp=temp.next;
            cunt++;
            if(cunt==m){
                Node a = head;
                for(int i = 1;i<cunt;i++){
                    a=a.next;
                }
                a.next=a.next.next.next;
                m=m*2;
            }
        }
    }
    void rotate(int n){
//        Given a singly linked list, rotate the linked list
//    counter-clockwise by k nodes. Where k is a given positive
//        integer. For example, if the given linked list is
//    10->20->30->40->50->60 and k is 4, the list should be modified to
//    50->60->10->20->30->40. Assume that k is smaller than the count
//        of nodes in a linked list.
        Node a = null;
        Node temp = head;
        
        while (temp.next!=null){
            temp=temp.next;
        }
        a = temp;
        for(int i = 0;i<n;i++) {
             temp = head;
            head = head.next;
            temp.next = null;
            a.next = temp;
            a = temp;

        }
    }


    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
//        System.out.println(tail.next);
    }
    public static void main(String[] args){
        LInkList ll = new LInkList();
//        69 37 72 69 100 84 48 68 87 83
        ll.insertFirst(90);
        ll.insertFirst(80);
        ll.insertFirst(70);
        ll.insertFirst(60);
        ll.insertFirst(50);
//        ll.insertFirst(4);
//        ll.insertFirst(3);
//        ll.insertFirst(2);
//        ll.insertFirst(1);
        ll.display();
        ll.rotate(2);

    }
}
