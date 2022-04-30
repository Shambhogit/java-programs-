package com.PracticeDsa;
class stk {
    private class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
        }
    }
    node top = null;

    public void push(int data){
        node new_node = new node(data);
        if(top == null){
            top = new_node;
        }
        else {
            new_node.next = top;
            top = new_node;
        }
    }
    public void showStk(){
        node temp = top;
        System.out.print("\nTOP-->");
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
    public void push(){
        if(top == null){
            System.out.println("stack underFlow ");
            return;
        }
        System.out.println(top.data);
        top = top.next;
    }
}
public class SULL {
    public static void main(String[] args){
        stk s = new stk();
        s.push(54);
        s.push(33);
        s.push(65);
        s.push(12);
        s.push(98);
        s.push(1);
        s.showStk();
        s.push();
        s.showStk();
    }

}
