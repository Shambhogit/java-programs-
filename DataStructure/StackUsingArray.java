package com.DataStructure;

public class StackUsingArray {

        private static final int n = 10;
        int[] arr = new int[n];
        int top = -1;

        public void push(int data) {
            if (top == n - 1) {
                System.out.println("Stack OverFlow");
            } else {
                top = top + 1;
                arr[top] = data;
            }
        }

        public void peek() {
            if(top==-1){
                System.out.println("Stack is empty");
            }
            else {
            System.out.println(arr[top]);
            }
        }
        public void pop(){
            if(top==-1){
                System.out.println("Stack UnderFlow");
            }
            else {
                System.out.println("POP Element is " + arr[top]);
                top = top - 1;
            }
        }
        public void display(){
            if(top==-1)
            {
                System.out.println("There is no Element in stack to Display");
            }
            else {
                for (int i = top;i> -1;i--){
                    System.out.println(arr[i]);
                }
            }
        }


    public static void main(String[] args) {
        StackUsingArray a1 = new StackUsingArray();
        a1.push(30);
        a1.push(43);
        a1.push(60);
        a1.push(61);
        a1.push(62);
        a1.push(63);
        a1.push(64);
        a1.push(65);
        a1.push(66);
        a1.push(67);
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();
        a1.pop();

        a1.display();
    }

}
