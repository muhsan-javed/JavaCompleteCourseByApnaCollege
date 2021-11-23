package com.muhsantech;

import java.util.Scanner;

public class Lecture_3_Conditional_Statements_If_else_Switch_Break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int age  = scanner.nextInt();
//
//        if (age > 18)
//            System.out.println("Adult");
//        else
//            System.out.println("Not Adult");

//        int number = scanner.nextInt();
//        if (number % 2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("old");
//        }

//        int a = 25;
//        int b = 10;

//        if (a == b){
//            System.out.println("Equal");
//        }
//        else if (a > b) {
//            System.out.println("a is greater");
//        }
//        else {
//                System.out.println("a is lesser");
//        }

        int Button  = scanner.nextInt();
        switch (Button) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Muhsan");
            case 3 -> System.out.println("Ali");
            case 4 -> System.out.println("Sahid");
            default -> System.out.println("Invalid Button");
        }




    }
}
