package com.PracticeDsa;

public class LinkListDeletion {
    public static void main(String[] args){
        ll l1 = new ll();
        l1.create(44);
        l1.create(45);
        l1.create(46);
        l1.create(47);
        l1.create(48);
        l1.create(49);
        l1.create(50);
        l1.display();
        l1.deleteFirst();
        l1.deleteEnd();
        l1.display();

    }
}
