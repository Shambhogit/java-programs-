package com.javacource.File;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // File name Specified
        try {
            File obj = new File("myFile.txt");
            System.out.println("File is created");
            if (obj.createNewFile()) {
                System.out.println("File created : "+obj.getName());
            }
            else{
                System.out.println("file already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
