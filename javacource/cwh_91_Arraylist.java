package com.javacource;

import java.util.ArrayList;

public class cwh_91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(43);
        l1.add(5);
        l1.add(74);
        l1.add(87);
        l1.add(0,34);
        l1.add(6);
        System.out.println(l1.get(4));//it gives element at 4th index;
        System.out.println(l1);

    }
}
