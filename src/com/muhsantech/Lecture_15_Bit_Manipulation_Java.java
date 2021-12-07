package com.muhsantech;

import java.util.Scanner;

public class Lecture_15_Bit_Manipulation_Java {
    public static void main(String[] args) {
        /*int n = 5 ;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }*/

       /* int n = 5 ;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber  = bitMask | n;
        System.out.println(newNumber);*/

        /*int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);*/

        // UPdate bit
        // Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
        // for 1            for 0
        //BitMask: 1<<i     BitMas : 1<<i
        //Operation: AND    Operation: OR
        // with NOT
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int operation =scanner.nextInt();
        // oper = 1 : Set oper =0 : Claer
        int n = 5; // 0101
        int pos = 1;
        //int operation = 1; // update bit to 1 else update bit to 0

        int bitMask = 1<<pos;
        if (operation == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            // Clear
            int newBitMAsk = ~(bitMask);
            int newNumber = newBitMAsk & n;
            System.out.println(newNumber);
        }


    }
}
