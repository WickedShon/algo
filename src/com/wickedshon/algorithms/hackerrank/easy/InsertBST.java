package com.wickedshon.algorithms.hackerrank.easy;

import com.wickedshon.algorithms.topics.Node;

/**
 * @date: 11/6/2021
 * @author: wickedShon
 * Program description: Inserting into BST with recursion
 * Status: Complete
 * Solution time complexity: n
 * Solution space complexity: n
 */

public class InsertBST {
   private <E extends Comparable<E>> Node<E> insert(Node<E> head, E value) {
      if (head == null) {
         head = new Node<>(value);
         return head;
      }

      if (head.getValue().compareTo(value) > 0) {
         head.setLeft(insert(head.getLeft(), value));
      } else {
         head.setRight(insert(head.getRight(), value));
      }

      return head;
   }

   private <E> void print(Node<E> head) {
      if (head == null) {
         return;
      }
      if (head.getLeft() == null && head.getRight() == null) {
         System.out.print(head.getValue() + " ");
         return;
      }

      if (head.getLeft() != null) {
         print(head.getLeft());
      }
      if (head.getRight() != null) {
         print(head.getRight());
      }
   }

   public static void main(String[] args) {
      Node<Integer> n1 = new Node<>(13);
      Node<Integer> n2 = new Node<>(5);
      Node<Integer> n3 = new Node<>(14);
      Node<Integer> n4 = new Node<>(6);

      n1.setLeft(n2);
      n1.setRight(n3);
      n2.setRight(n4);

      InsertBST insertBST = new InsertBST();
      Node<Integer> node =  insertBST.insert(n1, 12);
      insertBST.print(node);
   }
}
