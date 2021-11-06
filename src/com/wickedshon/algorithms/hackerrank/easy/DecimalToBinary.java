package com.wickedshon.algorithms.hackerrank.easy;

/**
 * @date: 11/5/2021
 * @author: wickedShon
 * Program description: convert decimal to binary with recursion
 * Status: Complete
 * Solution time complexity: n
 * Solution space complexity: n
 */

public class DecimalToBinary {
   private static String concat(int integer, String string) {
      if (integer == 0) {
         return string;
      }

      string = integer % 2 + string;
      return concat(integer / 2, string);
   }

   public static void main(String[] args) {
      System.out.println(concat(48, ""));
   }
}
