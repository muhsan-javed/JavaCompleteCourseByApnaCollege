package com.muhsantech;

import java.util.Scanner;

public class Lecture_5_9_Best_Patterns_Questions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // Line rows
//        int m = scanner.nextInt();//

        int n = 5;
        int m = 4;
        // Q 1
        // outer loop Rows
//        for (int i = 0; i < n;i++ ){
//            //inner loop Cols
//            for (int j = 0; j < m;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



        // Q 2 Hollow Rectangle
        //outer loop
//        for (int i =1;i<=n;i++){
//            //inner loop
//            for (int j =1; j<=m;j++){
//                //cell -> (i,j)
//                if (i == 1 || j == 1 || i == n || j ==m ){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        // Q 3 Half Pyramid
        // outer loop
//        for (int i = 1; i<=n;i++){
//            // inner
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Q 4 Inverted Half Pyramid
        // outer loop
//        for (int i = n; i >= 1; i--){
//            // inner
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Q 5 Inverted Half Pyramid (rotated by 180 deg)1
        // outer loop Rows
//        for (int i=1; i<=n; i++ ){
//            //inner loop -> space print
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            //inner loop -> Star pint
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Q 6 Half Pyramid with Numbers

        // outer loop
//        for (int i = 1; i<=n;i++){
//            // inner
//            for (int j = 1; j <= i; j++){
//                System.out.print(j+"  ");
//            }
//            System.out.println();
//        }


        // Q 7 Inverted Half Pyramid with Numbers
        // outer loop
//        for (int i = 1; i<=n; i++){
//            // inner
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        int number = 1;
        // Q 8 Floyd's Triangle
//        for (int i=1; i<=n; i++){
//            // inner
//            for (int j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

        // Q 9  0-1 Triangle
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }



    }

}
