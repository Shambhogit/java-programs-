package com.PracticeDsa;

public class dllmain {
    public static void main(String[] args) {
        dll d1 = new dll();
        d1.insertEnd(54);
        d1.insertEnd(55);
        d1.insertEnd(56);
        d1.insertEnd(57);
        d1.insertEnd(58);
        d1.insertEnd(59);
        d1.insertFirst(100);
        d1.Display();
        d1.insertAtIndex(21,5);
        d1.insertAtIndex(1,1);
        d1.insertAtIndex(1000,9);
        d1.deletionFirst();
        d1.Display();



    }
}
