package com.bejourney.leetcode;

import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        int [] arr2 = {10,20,30,40};

        System.out.println("Getting first element: " + arr2[0]);
        System.out.println("Size of array1: " + arr1.length);
        System.out.println("Size of array2: " + arr2.length);

        System.out.print("Printing all the values of array2 with enhance loop: ");
        for (int j : arr2) {
            System.out.print(" "+ j);
        }
        System.out.println();


        System.out.print("Printing all the values of array2 with normal loop: ");
        for (int i= 0; i<arr2.length; i++){
            System.out.print(" " + arr2[i]);
        }
        System.out.println();

        arr2[0] = 50;
        System.out.println("Changing the value of 1st element: " + arr2[0]);

        System.out.println("After changing the 1st element: "+ Arrays.toString(arr2));


    }
}
