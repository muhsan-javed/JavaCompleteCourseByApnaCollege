package com.muhsantech;

import java.util.Scanner;

public class Lecture_7_Functions_And_Methods_Java {
    public static void printMyName(String name){
        System.out.println(name);

    }
    //    public static int calculateSum(int a,int b){
//        return a + b;
//    }
    public static int MultiSum(int a,int b){
        return a * b;
    }

    public static void printFactorial(int n){
        //loop
        if (n < 0 ){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i=n;i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        int b= scanner.nextInt();
//        printMyName(name); // call the function

//        int sum = MultiSum(a,b);
//        System.out.println("Product of 2 number is : "+MultiSum(a,b));
        printFactorial(n);



    }
}
