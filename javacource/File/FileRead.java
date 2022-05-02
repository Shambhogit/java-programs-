package com.javacource.File;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
            File file = new File("myFile.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
