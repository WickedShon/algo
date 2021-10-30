package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 10/23/2021
 * @author: wickedShon
 * Program description: Simple merge sort algorithm implementation
 * Status: Complete
 * Solution time complexity: Worst case, best: nlogn
 * Solution space complexity: O(n) because of the new array to store the data
 */

public class MergeSort {
   public static void merge(int[] numbers, int[] sorted, int start, int end) {

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
      merge(numbers, sorted, start, mid);
      // recurse until star >= end and return from the right side
      // 3, 2, 7, 5
      // 2
      // 7, 5
      // 5
      merge(numbers, sorted, mid + 1, end);
      mergeSort(numbers, sorted, start, end);
   }

   private static void mergeSort(int[] numbers, int[] sorted, int start,
                                 int end) {
      int leftSize = (start + end) / 2;
      int rightStart = leftSize + 1;

      int i = start;
      int j = rightStart;
      int k = start;

      // while the indices are less than the size of the left and right
      // portions of the array, keep comparing and adding to the new array
      while (i <= leftSize && j <= end) {
         if (numbers[i] <= numbers[j]) {
            sorted[k++] = numbers[i];
            i++;
         } else {
            sorted[k++] = numbers[j];
            j++;
         }
      }

      // add the leftover of the left side to the array
      System.arraycopy(numbers, i, sorted, k, leftSize - i + 1);
      // add the leftover of the right side to the array
      System.arraycopy(numbers, j, sorted, k, end - j + 1);
      // copy the new array to the parameter
      System.arraycopy(sorted, start, numbers, start, end - start + 1);
   }

   public static void main(String[] args) {
      int[] numbers = {3, 1, 6, 5, 8, 7, 2};
      merge(numbers, new int[numbers.length], 0, numbers.length - 1);

      System.out.println(Arrays.toString(numbers));
   }
}
