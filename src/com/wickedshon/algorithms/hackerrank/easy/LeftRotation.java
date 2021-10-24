package com.wickedshon.algorithms.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date: 10/23/2021
 * @author: wickedShon
 * Program description:
 * A left rotation operation on an array shifts each of the array's elements 1
 * unit to the left. For example, if 2 left rotations are performed on array
 * [1,2,3,4,5], then the array would become [3,4,5,1,2].
 * Note that the lowest index item moves to the
 * highest index in a rotation. This is called a circular array.
 * Status: Complete
 * Logic:
 * 1 2 3 4 5
 * 5 4 3 2 1
 * 5 4 -> 4 5
 * 3 2 1 -> 1 2 3
 * Solution time complexity: 3N -> O(N)
 * Solution space complexity: O(1)
 */

public class LeftRotation {
   public static List<Integer> rotLeftConstantSpace(List<Integer> a, int d) {
      d %= a.size();

      reverse(a, 0, a.size() - 1);
      reverse(a, 0, d - 2);
      reverse(a, d - 1, a.size() - 1);

      return a;
   }

   private static void reverse(List<Integer> a, int i, int j) {
      while (i < j) {
         int temp = a.get(i);
         a.set(i, a.get(j));
         a.set(j, temp);
         i++;
         j--;
      }
   }

   public static List<Integer> rotLeftNSpace(List<Integer> a, int d) {
      d %= a.size();

      List<Integer> numbers = new ArrayList<>(a.size());
      a.forEach((i) -> numbers.add(i));

      for (int i = 0; i < a.size(); i++) {
         if (i < d) {
            numbers.set((a.size() + i - d), a.get(i));
         } else {
            numbers.set((i - d), a.get(i));
         }
      }

      return numbers;


   }

   public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
      LeftRotation.rotLeftConstantSpace(list, 3);

      list.forEach(integer -> {
         System.out.print(integer + ",");
      });
   }
}
