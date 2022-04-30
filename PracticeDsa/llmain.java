package com.PracticeDsa;

public class llmain {
    public static void main(String[] args) {
        linklist1 ll = new linklist1();
        ll.insertFirst(55);
        ll.insertFirst(43);
        ll.insertFirst(2);
        ll.insertFirst(77);
        ll.insertEnd(100);
        ll.insetAtIndex(42,2);
        ll.display();
        System.out.println(ll.size);
    }
}
