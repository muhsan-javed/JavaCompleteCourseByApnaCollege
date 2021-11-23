package com.muhsantech;

import java.util.Scanner;

public class Lecture_6_Advanced_Pattern_Questions {

    public static void main(String[] args) {

        // Q 10 print the pattern
        // Butterfly Pattern
//        int n = 5;
//        //Upper half
//        for (int i=1; i<=n; i++){
//            //1st part
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // lower half
//        for (int i=n; i>=1; i--){
//            //1st part
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            // Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Q 11 print the pattern
        // Solid Rhombus
//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            //Spaces
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//            // Stars
//            for (int j=1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Q. 12 Print the pattern Number Pyramid
//        int n = 5;
//
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//            //numbers -> print row no , row no time
//            for(int j=1; j<=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        // Q. 13 Print the Pattern
        // Palindromic Pattern
//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            //Spaces
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            // 1st half number
//            for (int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//
//            //2nd half number
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Q. 14 Print the pattern
        // Diamond Pattern
        int n = 4;

        //upper half
        for (int i=1; i<=n; i++){
            //Spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i=n; i>=1; i--){
            //Spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
