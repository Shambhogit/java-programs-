package com.javacource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class swh_111_fileHandeling {
    public static void main(String[] args) {
        //creating file
        File myFile = new File("shambho.txt");
        try{
        myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        //writing to a file
//        try {
//            FileWriter fr = new FileWriter("shambho.txt");
//            fr.write("This is FileWriter is writing this line");
//            fr.close();
//        }catch(IOException e){
//            System.out.println(e);
//        }

        //reading data from file
//        try{
//        Scanner sc = new Scanner(myFile);
//        while(sc.hasNextLine()){
//            String str = sc.nextLine();
//            System.out.println(str);
//        }
//        }catch(IOException e){
//            System.out.println(e);
//        }

        //deleting file

        if(myFile.delete()){
            System.out.println("File is deleted "+myFile.getName());
        }
        else {
            System.out.println("Some error is occur");
        }
    }
}
