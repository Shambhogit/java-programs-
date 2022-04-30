package com.jprmanual;

import java.util.Arrays;
import java.util.Vector;
/*
Write a program to insert different element in the vector and display them (ref code up to line no 20);
AND
Write a program to use different methods of vector class
 */

public class Prac_14a {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        //addElement(object obj)
        vec.addElement("Komal");
        vec.addElement("Vishal");
        vec.addElement("Vijay");
        vec.addElement("Madan");
        vec.addElement("Pooja");
        System.out.println(vec);

        //capacity() method
        System.out.println(vec.capacity());

        //contains(object elem) methode
        System.out.println(vec.contains("Vishal"));
        System.out.println(vec.contains("Shambho"));

        //clear() methode
        //System.out.println(vec);
        //vec.clear();   // it clears all the element in vectors
        //System.out.println(vec);

        //elementAt(int index) method
        System.out.println(vec.elementAt(2));

        //firstElement() method
        System.out.println(vec.firstElement());

        //lastElement() method
        System.out.println(vec.lastElement());

        //insertElementAt(object obj, int index) methode
        vec.insertElementAt("shambho",3);
        System.out.println(vec);

        //removeElementAt(int index) method
        vec.removeElementAt(2);
        System.out.println(vec);

        //size() method
        System.out.println(vec.size());

        //copyInto(Object[] array)
        String []arr = new String[vec.size()];
        vec.copyInto(arr);
        System.out.println("This is not vector it is String array");
        System.out.println(Arrays.toString(arr));

    }
}
