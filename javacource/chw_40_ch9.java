package com.javacource;
class myEmployee{
    int id;
    String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class chw_40_ch9 {
    public static void main(String[] args) {
        myEmployee e1 = new myEmployee();
        //shambho.id=002;
        //shambho.name="shambho";---->Trows an error deuto privet accses modifire
        e1.setName("shambho");
        System.out.println(e1.getName());
        e1.setId(11);
        System.out.println(e1.getId());
    }
}
