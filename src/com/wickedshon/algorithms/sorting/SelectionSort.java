package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 11/3/2021
 * @author: wickedShon
 * Program description: generic selection sort algorithm implementation
 * Status: Complete
 * Solution time complexity: n^2 for all cases
 * Solution space complexity: Constant
 */

public class SelectionSort {
   private static <E extends Comparable<E>> void selectionSort(E[] elements) {
      int min;
      for (int i = 0; i < elements.length - 1; i++) {
         // store the min value index if found a min value from the elements
         // once the loop is over, swap the min element with the current loop
         // element
         min = i;
         for (int j = i + 1; j < elements.length; j++) {
            if (elements[min].compareTo(elements[j]) > 0) {
               min = j;
            }
         }
         swap(elements, i, min);
      }
   }

   private static <E extends Comparable<E>> void swap(E[] elements, int i,
                                                      int j) {
      E temp = elements[i];
      elements[i] = elements[j];
      elements[j] = temp;
   }
   public static void main(String[] args) {
      String[] strings = {"vector", "algorithm", "sort", "structure", "data",
         "pc", "electronics", "people", "nature"};
      Character[] characters = {'d', 'a', 'w', 'o', 's', 'q', 's', 'r', 'a',
         'z'};
      Integer[] numbers = {3, 1, 4, 20, 0, -1, 43, 15, 2, 1, 6, 5, 8};

      selectionSort(strings);
      selectionSort(characters);
      selectionSort(numbers);

      System.out.println(Arrays.toString(strings));
      System.out.println(Arrays.toString(characters));
      System.out.println(Arrays.toString(numbers));
   }
}
