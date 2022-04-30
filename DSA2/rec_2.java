package com.DSA2;

public class rec_2 {
//    calculte the sum of Digit Ex 4321 = 4+3+2+1 = 10;
    static int sumDig(int num){
        if(num == 0){
            return 0;
        }
        return (num%10) + sumDig(num/10);
    }
    //to calculate fibonachi of given number
    public static int Facto(int n) {
        if(n==1){
            return 1;
        }
        return n*Facto(n-1);
    }
    //to revers the number
    static int sum = 0;
    static void rever1(int num){
        if(num == 0){
            return;
        }
        int rem = num%10;
        sum = sum*10+rem;
        rever1(num/10);
    }
    public static void main(String[] args) {
//        System.out.println(Facto(10));
//        System.out.println(sumDig(4321));
        rever1(124);
        System.out.println(sum);
    }
}
