package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 10/23/2021
 * @author: wickedShon
 * Program description: Simple generic merge sort algorithm implementation
 * Status: Complete
 * Solution time complexity: Best case: Omega(nlogn), Average case: Theta(nlogn),
 * Worst case: O(nlogn)
 * Solution space complexity: O(n)
 */

public class MergeSort {
   public static <E extends Comparable<E>> void merge(E[] elements,
                                                      E[] sorted,
                                                      int start,
                                                      int end) {

      // return if there is no sub array to divide
      if (end <= start) {
         return;
      }
      int mid = (end + start) / 2;

      // recurse until star >= end and return from the left side
      // 3, 2, 7, 5
      // 3, 2
      // 3
      // 7
      merge(elements, sorted, start, mid);
      // recurse until star >= end and return from the right side
      // 3, 2, 7, 5
      // 2
      // 7, 5
      // 5
      merge(elements, sorted, mid + 1, end);
      mergeSort(elements, sorted, start, end);
   }

   private static <E extends Comparable<E>> void mergeSort(E[] elements,
                                                           E[] sorted,
                                                           int start,
                                                           int end) {
      int leftSize = (start + end) / 2;
      int rightStart = leftSize + 1;

      int i = start;
      int j = rightStart;
      int k = start;

      // while the indices are less than the size of the left and right
      // portions of the array, keep comparing and adding to the new array
      while (i <= leftSize && j <= end) {
         if (elements[i].compareTo(elements[j]) < 0) {
            sorted[k++] = elements[i];
            i++;
         } else {
            sorted[k++] = elements[j];
            j++;
         }
      }

      // add the leftover of the left side to the array
      System.arraycopy(elements, i, sorted, k, leftSize - i + 1);
      // add the leftover of the right side to the array
      System.arraycopy(elements, j, sorted, k, end - j + 1);
      // copy the new array to the parameter
      System.arraycopy(sorted, start, elements, start, end - start + 1);
   }

   // sample output
   public static void main(String[] args) {
      String[] strings = {"vector", "algorithm", "sort", "structure", "data"};
      Character[] characters = {'d', 'a', 'w', 'o', 's'};
      Integer[] numbers = {3, 1, 6, 5, 8};

      merge(strings, new String[strings.length], 0, strings.length - 1);
      merge(characters, new Character[characters.length], 0, characters.length - 1);
      merge(numbers, new Integer[numbers.length], 0, numbers.length - 1);

      System.out.println(Arrays.toString(strings));
      System.out.println(Arrays.toString(characters));
      System.out.println(Arrays.toString(numbers));
   }
}
