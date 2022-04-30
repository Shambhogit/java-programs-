package com.Microproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static com.Microproject.StudentDao.insertStudentToDB;

public class start {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student Management App");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("PRESS 1 TO ADD STUDENT");
            System.out.println("PRESS 2 TO DELETE STUDENT");
            System.out.println("PRESS 3 TO DISPLAY STUDENT");
            System.out.println("PRESS 4 TO EXIT APP");
            int c = sc.nextInt();

            if(c == 1) {
//				add student
                System.out.println("Enter user name : ");
                String name = br.readLine();

                System.out.println("Enter user phone : ");
                String phone = br.readLine();

                System.out.println("Enter user city : ");
                String city = br.readLine();

//				create student object to store student
                Student st = new Student(name,phone,city);
                boolean ans = StudentDao.insertStudentToDB(st);
                if(ans == true){
                    System.out.println("Student is added successfully");
                }
                else {
                    System.out.println("Some thing went wrong try again...");
                }
            }
            else if(c == 2) {
//				delete student
            }
            else if( c == 3) {
//				display student
            }
            else if (c == 4) {
//				Exit code
                break;
            }
            else{

            }
        }
        System.out.println("Thankyou for using my application");
        System.out.println("See you soon... bye");
    }
}
