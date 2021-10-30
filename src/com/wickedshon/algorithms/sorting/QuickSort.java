package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 10/29/2021
 * @author: wickedShon
 * Program description: Quick sort algorithm implementation.
 * Status: Complete
 * Solution time complexity: Best case: Omega(nlogn), Average case: Theta(nlogn),
 * Worst case: O(n^2)
 * Solution space complexity: O(n)
 */

public class QuickSort {
   private static <E extends Comparable<E>> void quickSort(E[] elements,
                                                           int start,
                                                           int end) {
      // return if there is no element left to compare
      if (start >= end) {
         return;
      }
      // get the mid element as a comparison point
      E pivot = elements[(start + end) / 2];
      // get the most recent left as an index to partition the array
      int index = partition(elements, start, end, pivot);
      // divide the array as left sub arrays
      quickSort(elements, start, index - 1);
      // divide the array as right sub arrays
      quickSort(elements, index, end);
   }

   private static <E extends Comparable<E>> int partition(E[] elements,
                                                          int start,
                                                          int end,
                                                          E pivot) {
      while (start <= end) {
         while (elements[start].compareTo(pivot) < 0) {
            start++;
         }
         while (elements[end].compareTo(pivot) > 0) {
            end--;
         }
         if (start <= end) {
            swap(elements, start, end);
            start++;
            end--;
         }
      }

      return start;
   }

   private static <E> void swap(E[] elements, int start, int end) {
      E temp = elements[start];
      elements[start] = elements[end];
      elements[end] = temp;
   }

   // sample output
   public static void main(String[] args) {
      String[] strings = {"vector", "algorithm", "sort", "structure", "data"};
      Character[] characters = {'d', 'a', 'w', 'o', 's'};
      Integer[] numbers = {3, 1, 6, 5, 8};

      quickSort(strings, 0, strings.length - 1);
      quickSort(characters, 0, characters.length - 1);
      quickSort(numbers, 0, numbers.length - 1);

      System.out.println(Arrays.toString(strings));
      System.out.println(Arrays.toString(characters));
      System.out.println(Arrays.toString(numbers));
   }
}
