package com.wickedshon.algorithms.hackerrank.easy;


import com.wickedshon.algorithms.topics.Node;

/**
 * @date: 11/6/2021
 * @author: wickedShon
 * Program description: Reversed generic linked list implementation
 * Status: Complete
 * Solution time complexity: n
 * Solution space complexity: n
 */

public class ReversedLinkedList {

   private static <E> Node<E> reverse(Node<E> node) {
      if (node.getNext() == null) {
         return node;
      }

      Node<E> temp = reverse(node.getNext());
      node.getNext().setNext(node);
      node.setNext(node);

      return temp;
   }

   public static void main(String[] args) {
      Node<Integer> node1 = new Node<>(1);
      Node<Integer> node2 = new Node<>(2);
      Node<Integer> node3 = new Node<>(3);
      Node<Integer> node4 = new Node<>(4);

      node1.setNext(node2);
      node2.setNext(node3);
      node3.setNext(node4);

      reverse(node1);
   }
}
