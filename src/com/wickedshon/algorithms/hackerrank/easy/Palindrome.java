package com.wickedshon.algorithms.hackerrank.easy;

/**
 * @date: 11/5/2021
 * @author: wickedShon
 * Program description: Palindrome problem solved with recusrion method
 * Status: Complete
 * Solution time complexity: n
 * Solution space complexity: n
 */

public class Palindrome {
   private static boolean palindromeRecursive(String string) {
      if (string.length() == 0 || string.length() == 1) {
         return true;
      }

      if (string.charAt(0) == string.charAt(string.length() - 1)) {
         return palindromeRecursive(string.substring(1, string.length() - 1));
      }

      return false;
   }

   public static void main(String[] args) {
      System.out.println(palindromeRecursive("radar"));
   }
}
