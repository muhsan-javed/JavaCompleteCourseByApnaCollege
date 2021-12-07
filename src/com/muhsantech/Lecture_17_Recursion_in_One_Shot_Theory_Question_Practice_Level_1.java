package com.muhsantech;
// Class 01
public class Lecture_17_Recursion_in_One_Shot_Theory_Question_Practice_Level_1 {

 /*
   // Q1
    public static void printNumber(int n){
        if ( n == 0 ){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }*/

 // Q2
 /*public static void printNumber(int n){
     if ( n == 6 ){
         return;
     }
     System.out.println(n);
     printNumber(n+1);
 }*/
// Q 3
   /* public static void printSum(int i, int n, int sum){
        if (i == n ){
            sum += i;
            System.out.println(sum);
            return; //?
        }
        sum += i;
        printSum(i+1, n , sum);
        System.out.println(i);
    }*/

    // Q 4 Print Factorial of a number n
   /* public static int calcfactorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int fact_num1 = calcfactorial(n-1);
        int fact_n = n *fact_num1;
        System.out.println(fact_num1);
//        System.out.println(fact_n);
        return fact_n;
    }*/

    // Q 5 --> Print the fibonacci sequence till nth term*
    /*public static void printFib(int a ,int b, int n){
        if (n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }*/

    // Q 6 --> Print x^n (stack height = n) ?
    /*public static int calcPower(int x, int n){
        if  (n == 0){// base case 1
            return 1;
        }
        if (x == 0){ // base case 2
            return 0;
        }
        int xPower1 = calcPower(x, n-1);
        int xPown = x * xPower1;
        return xPown;
    }*/

    // Q 7 --> Print x^n (stack height = logn) ?
    public static int calcPower(int x, int n){
        if  (n == 0){// base case 1
            return 1;
        }
        if (x == 0){ // base case 2
            return 0;
        }
        // if n is even
        if (n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {

        // Q 7 --> Print x^n (stack height = logn) AND
        int x = 2, n =5;
        int ans = calcPower(x, n);
        System.out.println(ans);

        // Q6 print x^n (stack height = n) ANS
//        int x = 2, n =5;
//        int ans = calcPower(x, n);
//        System.out.println(ans);


        // Q 5 --> Print the fibonacci sequence ANS
//        int a  = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib(a, b, n-2);

        // Q 4 print factorials ANS
//        int n = 5;
//        int ans = calcfactorial(n);
//        System.out.println("Factorial is: " + ans);

        // Q 3 Print sum of first n natural numbers ANS
//        printSum(1,5,0);

        // Q 2 Print Number from 1 to 5 ANS
//        printNumber(1); // n =1

        //Q 1 Print Numbers from from 5 to 1 ANS
//        int n = 1;
//        printNumber(n); // 5

    }

}
