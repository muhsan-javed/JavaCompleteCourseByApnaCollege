package com.muhsantech;



public class Lecture_20_Sorting_in_Java_Bubble_Sort_Selection_Sort_Insertion_Sort {
    /*// Bubble Sorting Method
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/
    /*// Selection sort Method
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/

    // Insertion Sort Method
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // time compexity = 0(n^2)
        // Bubble Sort
        // 7 8 9 2 3 4 1 6 5  ?
        // 1 2 3 4 5 6 7 8 9 sorting
       /* int[] arr = {7, 8, 1, 3, 2};
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);*/

        // Selection Sort
       /* int[] arr = {7, 8, 1, 3, 2};

        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]  = temp;
        }
        printArray(arr);*/

        // Insertion Sort
        int[] arr = {7, 8, 1, 3, 2};

        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
