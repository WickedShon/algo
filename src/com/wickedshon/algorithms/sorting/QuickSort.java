package com.wickedshon.algorithms.sorting;

import java.util.Arrays;

/**
 * @date: 10/29/2021
 * @author: wickedShon
 * Program description: Quick sort algorithm implementation.
 * Status: Complete
 * Solution time complexity: Worst case O(n^), best case Omega(nlogn)
 * Solution space complexity: O(n)
 */

public class QuickSort {
   private static void quickSort(int[] numbers, int start, int end) {
      // return if there is no element left to compare
      if (start >= end) {
         return;
      }
      // get the mid element as a comparison point
      int pivot = numbers[(start + end) / 2];
      // get the most recent left as an index to partition the array
      int index = partition(numbers, start, end, pivot);
      // divide the array as left sub arrays
      quickSort(numbers, start, index - 1);
      // divide the array as right sub arrays
      quickSort(numbers, index, end);
   }

   private static int partition(int[] numbers, int start, int end, int pivot) {
      while (start <= end) {
         while (numbers[start] < pivot) {
            start++;
         }
         while (numbers[end] > pivot) {
            end--;
         }
         if (start <= end) {
            swap(numbers, start, end);
            start++;
            end--;
         }
      }

      return start;
   }

   private static void swap(int[] numbers, int start, int end) {
      int temp = numbers[start];
      numbers[start] = numbers[end];
      numbers[end] = temp;
   }

   public static void main(String[] args) {
      int[] numbers = {3, 1, 6, 5, 8};
      quickSort(numbers, 0, numbers.length - 1);

      System.out.println(Arrays.toString(numbers));
   }
}
