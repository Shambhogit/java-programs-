package com.javacource;
class myMainEmployee {
    int id;
    String name;
    public myMainEmployee (){
        id = 44;
        name = "shambho";
    }
    public myMainEmployee(String a, int myid){
        name=a;
        id = myid;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}
    public class CWH_42_ch9 {
    public static void main(String[] args){
    myMainEmployee e1 = new myMainEmployee("shambho",33);

        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }

}
