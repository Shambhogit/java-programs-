package com.PracticeDsa;
class LinkList{
    private class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }
    int size;
    node top = null;
    public LinkList(){
        this.size = -1;
    }
    public void display(){
        node temp = top;
        System.out.println("TOP -> ");
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END\n");
    }

    public void push(int data){
        node new_node = new node(data);
        if(top == null){
            top = new_node;
        }
        else{
            top.next=new_node;
            top = new_node;
        }
    }
}
public class stackLinkList {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.push(43);
        ll.push(53);
        ll.push(12);
        ll.push(77);
        ll.push(133);
        ll.display();

    }
}
