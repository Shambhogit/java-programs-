package com.PracticeDsa;
class stackUsingLinkList{
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    Node top = null;
    public void push(int data){
            Node new_node = new Node(data);
            if(top==null){
            top = new_node;}

    }
}
public class stackll {
}
