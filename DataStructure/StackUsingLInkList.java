package com.DataStructure;

public class StackUsingLInkList {
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    Node top = null;
    int size;

    public StackUsingLInkList() {
        this.size = 0;
    }

    public void push(int data){
        Node new_node = new Node(data);
        if(top==null){
            top = new_node;
        }
        else{
            new_node.next=top;
            top=new_node;
        }
        size++;
    }
    Node peek(){
        return top;
    }
    void pop(){
        if(top==null){
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("POP Element is : " + top.data);
            top = top.next;
        }
        size--;
    }
    void display(){
        Node temp = top;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
            System.out.print("END\n");
    }

    public static void main(String[] args) {
        StackUsingLInkList sll = new StackUsingLInkList();
        sll.push(32);
        sll.push(54);
        sll.push(87);
        sll.push(21);
        sll.push(87);
        sll.push(99);
        sll.display();
    }

}
