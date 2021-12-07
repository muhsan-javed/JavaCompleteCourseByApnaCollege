package com.muhsantech;

import java.util.Scanner;

public class Lecture_11_2D_Arrays_Java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows");
        int row = scanner.nextInt();
        System.out.println("Enter Columns");
        int cols = scanner.nextInt();

        int[][] numbers = new int[row][cols];

        //input
        //rows
        for (int i=0; i<row; i++){
            //Columns
            for (int j=0; j<cols; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n OutPut");
        //output
//        for (int i=0; i<row; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }


        //Q1
        System.out.println("Enter Any Number and find index");
        int x = scanner.nextInt();

        for (int i =0; i<row; i++){
            for (int j=0; j<cols; j++){
                // Compare with x
                if (numbers[i][j] == x ){
                    System.out.println("X found at location (" + i + ","+ j + ")");
                }
            }
        }

    }
}
