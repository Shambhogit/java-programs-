package com.DSA2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner cs = new Scanner(System.in);
//        list.add(43);
//        list.add(65);
//        list.add(34);
//        list.add(22);
//        list.add(21);
//        System.out.println(list);
//        list.set(2,100);
//        list.remove(2);
//        System.out.println(list);
//        user input of list

        for(int i = 0;i<5;i++){
            list.add(cs.nextInt());
        }
        for(int j = 0 ;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
