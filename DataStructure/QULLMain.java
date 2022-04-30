package com.DataStructure;

public class QULLMain {
    public static void main(String[] args) {
        QueueUsingLinkList q1 = new QueueUsingLinkList();
        q1.enqueue(44);
        q1.enqueue(54);
        q1.enqueue(55);
        q1.enqueue(76);
        q1.enqueue(32);
        q1.display();
        System.out.println(q1.size);
        System.out.println(q1.front.data);
        System.out.println(q1.rare.data);

        q1.dequeue();
        q1.display();
        System.out.println(q1.size);



    }
}
