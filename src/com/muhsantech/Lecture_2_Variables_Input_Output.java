package com.muhsantech;
import java.util.*;
public class Lecture_2_Variables_Input_Output {
    public static void main(String[] args) {
        // output
//        System.out.println("Hello world with java");
//        System.out.print("Hello world with java\n");
//        System.out.print("Hello world with java\n");

        // Qs print the pattern
        // *
        // **
        // ***
        // ****
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
        // To Print
        // *
        // **
//        System.out.println("*\n**"); // Used
//        System.out.println("**\n*");
//        System.out.println("***\n");

        // VARIABLES IN JAVA
        // a = 25 , b = 10
        // 2*(a+b)
        //2* -> Constant
        // (a+b) -> Variable

//        String name = "Ali Hyder";
        int age = 20;
        double price = 40.00;
        int a = 10;
        int b = 5;
//        int sum = a + b;
//        System.out.println(sum);

//        int mul = a * b;
//        System.out.println(mul);

        int ans = (a * b) / (a - b);
        System.out.println(ans);

        // Taking Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String last = sc.next();
        //nextFolat()
        //nextInt()
        System.out.println(name+" "+last);
    }
}
