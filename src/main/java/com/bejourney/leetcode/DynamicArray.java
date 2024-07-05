package com.bejourney.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 ;

        Integer [] brr1 = {20,40,60,80,100};
        arr2  = new ArrayList<>(Arrays.asList(brr1));

        System.out.println("Arr2 data: "+ arr2);
        List<Integer> brr2 = arr2;
        System.out.println("Brr2 data reference to arr2: "+ brr2);

        List<Integer> brr3 = new ArrayList<>(arr2);
        System.out.println("Brr3 data by creating actual copy of arr2:" + brr3);

        System.out.println("Getting The 1st element of arr2: " + arr2.get(0));

        System.out.print("Getting all data from arr2: ");
        for (int i: arr2){
            System.out.print(" " + i);
        }

        System.out.println();

        arr2.set(4,500);

        System.out.print("Getting all data after updating last element of arr2: ");
        for (int j= 0; j< arr2.size(); j++){
            System.out.print(" " + arr2.get(j));
        }

        System.out.println();
        arr2.add(-2);
        System.out.println(arr2);

        arr2.remove(arr2.size()-3 );
        System.out.println("After removing 3 elements from arr2: "+ arr2);

        arr2.remove(arr2.size()-2 );
        System.out.println("After removing 2 elements from arr2: "+ arr2);

        arr2.remove(arr2.size()-1);
        System.out.println("After removing 1 elements from arr2: "+ arr2);

        arr2.add(1, 300);
        System.out.println("After adding element at the 2nd place: " + arr2);

        arr2.add(800);
        System.out.println("Added to the end when don't give index: "+ arr2);

        arr2.remove(3);
        System.out.println("Remove with index3: "+ arr2);

    }
}

//   Array: it has fixed capacity and need to specify it's size when we initialize.
//       it can be wasteful and inconvenient.


//   Arraylist: (dynamic array = ArrayList) with the variable arr size come to save the array.
//       - get(), set(), size(), add(index, value), remove(index)
//        -add start from the end of array when don't give index.
//        -can remove with index specifying or counting from end of the array)

