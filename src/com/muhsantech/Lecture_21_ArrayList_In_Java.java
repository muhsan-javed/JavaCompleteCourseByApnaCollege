package com.muhsantech;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture_21_ArrayList_In_Java {
    public static void main(String[] args) {
//        Integer | Float | String | Double
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<Boolean> list = new ArrayList<Boolean>();

        // add elements
        list.add(2);
        list.add(3);
        list.add(8);
        System.out.println(list);

        //get elements
        int emlement = list.get(0);
        System.out.println(emlement);

        // add element in between
        list.add(1,2);
        System.out.println(list);

        //set elemrnt
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for (Integer integer : list) {
            System.out.println(integer);
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
