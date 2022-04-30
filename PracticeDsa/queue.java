package com.PracticeDsa;
class q {
    int size = 10;
    int []que = new int[size];
    int front ;
    int rare;
    public q (){
        front = -1;
        rare = -1;
    }
    public void enQueqe(int data){
        if(rare == size-1){
            System.out.println("Queue is full");
        }
        else if(front==-1 && rare == -1){
            front ++;
            rare ++;
            que[rare]=data;
        }else{
            rare++;
            que[rare]=data;
        }
    }
    public void deQueue(){
        if(rare>front) {
            for (int i = 0; i < rare; i++) {
                que[i] = que[i + 1];
            }
            rare--;
        } else if(rare == -1 && front == -1){
            System.out.println("queue is empty");
        }
        else if(rare == front){
            rare=front=-1;
            System.out.println("now last element deleted");
        }

    }

    public void display(){
        for(int i = 0;i<=rare;i++){
            System.out.print(que[i]+"  ");
        }
    }

}
public class queue {
    public static void main(String[] args){
        q q1 = new q();
        q1.enQueqe(100);
        q1.enQueqe(10);
        q1.enQueqe(40);
        q1.enQueqe(20);
        q1.enQueqe(20);
        q1.enQueqe(20);
        q1.enQueqe(20);
        q1.enQueqe(20);
        q1.enQueqe(20);
        q1.enQueqe(20);
//        q1.enQueqe(20);

        q1.display();
        System.out.println();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        System.out.println();
        q1.display();
//        System.out.println(q1.rare);
//        System.out.println(q1.front);
    }
}
