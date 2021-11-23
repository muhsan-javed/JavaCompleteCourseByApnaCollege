package com.muhsantech;

public class Lecture_13_String_Builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Muhsan");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char at index
//        sb.setCharAt(0,'S');
//        System.out.println(sb);

        sb.setCharAt(2,'H');
        System.out.println(sb);

        // delete the extra 'n'
//        sb.delete(2,3);
//        System.out.println(sb);

        //
        sb.append(" H"); // str = str + "e";
        sb.append("e"); // str = str + "l";
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
//        System.out.println(sb.length());


        StringBuilder str = new StringBuilder("hello");

        for (int i=0; i<str.length()/2; i++){
            int front  =i;
            int back = str.length() - 1-i; //5-1-0 = > 4

            char frontChar = str.charAt(front);
            char backtChar = str.charAt(back);

            str.setCharAt(front, backtChar);
            str.setCharAt(back, frontChar);

        }
        System.out.println(str);



    }
}
