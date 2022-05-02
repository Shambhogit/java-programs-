package com.javacource.File;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("myFile.txt");
            fw.write("Java is op language to learn is very easy some times it like hard but itis ok");
            fw.close();

        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
