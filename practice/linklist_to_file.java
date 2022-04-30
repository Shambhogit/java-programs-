package com.practice;

import java.io.File;
import java.io.IOException;

class LinkList{
    private class node{
        String name;
        int roll;
        int next;
        node(String name,int roll){
            this.name = name;
            this.roll = roll;
        }
    }
    public void addNode(String name, int roll){
        File myFile = new File("Student.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
public class linklist_to_file {
    public static void main(String[] args) {

    }
}
