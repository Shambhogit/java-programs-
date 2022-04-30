package com.PracticeDsa.ArrayOpration;

public class Deletion extends Insertion {
    public void deleteData(){
        System.out.println("\nYou want to enter data or index to delete operation");
        System.out.println("press \n1 data \n2 index");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the data to delete");
                int data = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (arr[i] == data) {
                        for (int j = i; j < n; j++) {
                            arr[j] = arr[j + 1];
                        }
                        n--;
                        break;
                    }
                }
                System.out.println("data not found");
                break;
            case 2:
                System.out.println("Enter the index of data to delete");
                int index = sc.nextInt();
                for (int j = index; j < n; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
