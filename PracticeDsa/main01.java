package com.PracticeDsa;

public class main01 {
    public static void main (String[] args){
        linklist0902 ll = new linklist0902();
        ll.insertFirst(43);
        ll.insertFirst(20);
        ll.insertFirst(54);
        ll.insertFirst(12);
        ll.display();
        ll.insertEnd(1000);
        ll.display();
        ll.insertAtIndex(400,5);
        ll.display();
        ll.insertAtIndex(300,4);
        ll.display();
        ll.deletionFirst();
        ll.display();
        ll.deletionEnd();
        ll.display();
    }
}
