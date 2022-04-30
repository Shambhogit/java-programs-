package com.jprmanual;
class Bank{
    public float interestRate;
    public void showInterest(){
        System.out.println("Interest of HDFC bank is : "+interestRate+" %");
    }
}
class Maharashtra_Bank extends Bank{
    float interestRate = 6.34f;

    @Override
    public void showInterest() {
        System.out.println("Interest of bank is : "+interestRate+" %");
    }
}
class Yes_bank extends Bank{
    float interestRate = 7.54f;

    @Override
    public void showInterest() {
        System.out.println("Interest of bank is : "+interestRate+" %");
    }
}
class SBI extends Bank{
    float interestRate = 8.76f;

    @Override
    public void showInterest() {
        System.out.println("Interest of bank is : "+interestRate+" %");
    }
}
public class Prac_17b {
    public static void main(String[] args) {
        Maharashtra_Bank m = new Maharashtra_Bank();
        m.showInterest();

        SBI s = new SBI();
        s.showInterest();

        Yes_bank y = new Yes_bank();
        y.showInterest();
    }
}
