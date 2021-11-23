package com.muhsantech;

import java.util.Scanner;

public class Lecture_10_Arrays_Introduction_Java {
    public static void main(String[] args) {
//        int[] marks = new int[3];
        int marks [] = new int[3];
        marks[0] = 97; //phy
        marks[1] = 87; //Space
        marks[2] = 99; //CS
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for (int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size \n");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter your INDEX numbers");
        //Input
        for (int i=0; i<size; i++){
            System.out.println("Index No: "+i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("found any number of index");
        int x = sc.nextInt();

        // Output
        for (int i =0; i<numbers.length; i++){
//            System.out.println("You enter this INDEX:  "+ numbers[i]);
            if (numbers[i] == x){
                System.out.println("x found at index : "+ i);
            }

        }

    }
}
