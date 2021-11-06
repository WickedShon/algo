package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 11/2/2021
 * @author: wickedShon
 * Program description: Generic insertion sort algorithm implementation
 * Status: Complete
 * Solution time complexity: Best Case: Omega(n), Average and Worst case: n^2
 * Solution space complexity: Constant
 */

public class InsertionSort {
   private static <E extends Comparable<E>> void insertionSort(E[] elements) {

      int j;
      for (int i = 0; i < elements.length - 1; i++) {
         // select the next comparable element from the array and store it,
         // while doing so keep checking if the stored element is less than
         // previous element in the list and if so, relocate the previous
         // element to the current location, otherwise insert the stored element
         j = i + 1;
         E index = elements[j];
         while (j > 0 && index.compareTo(elements[j - 1]) < 0) {
            elements[j] = elements[j - 1];
            j--;
         }
         elements[j] = index;
      }
   }

   public static void main(String[] args) {
      String[] strings = {"vector", "algorithm", "sort", "structure", "data",
         "pc", "electronics", "people", "nature"};
      Character[] characters = {'d', 'a', 'w', 'o', 's', 'q', 's', 'r', 'a',
         'z'};
      Integer[] numbers = {3, 1, 4, 20, 0, -1, 43, 15, 2, 1, 6, 5, 8};

      insertionSort(strings);
      insertionSort(characters);
      insertionSort(numbers);

      System.out.println(Arrays.toString(strings));
      System.out.println(Arrays.toString(characters));
      System.out.println(Arrays.toString(numbers));
   }
}
