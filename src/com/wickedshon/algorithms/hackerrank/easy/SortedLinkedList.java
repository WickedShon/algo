package com.wickedshon.algorithms.hackerrank.easy;


import com.wickedshon.algorithms.topics.Node;

/**
 * @date: 11/6/2021
 * @author: wickedShon
 * Program description: Sort given generic linked lists
 * Status: Complete
 * Solution time complexity: n
 * Solution space complexity: n
 */

public class SortedLinkedList{
   private <E extends Comparable<E>> Node<E> sort(Node<E> l, Node<E> r) {
      if (l == null) {
         return r;
      }
      if (r == null) {
         return l;
      }

      if (l.getValue().compareTo(r.getValue()) < 0) {
         l.setNext(sort(l.getNext(), r));
         return l;
      } else {
         r.setNext(sort(l, r.getNext()));
         return r;
      }
   }

   public static void main(String[] args) {
      Node<Integer> l1 = new Node<>(1);
      Node<Integer> l2 = new Node<>(3);
      Node<Integer> l3 = new Node<>(6);
      Node<Integer> l4 = new Node<>(10);

      Node<Integer> r1 = new Node<>(0);
      Node<Integer> r2 = new Node<>(2);
      Node<Integer> r3 = new Node<>(5);
      Node<Integer> r4 = new Node<>(8);

      l1.setNext(l2);
      l2.setNext(l3);
      l3.setNext(l4);

      r1.setNext(r2);
      r2.setNext(r3);
      r3.setNext(r4);

      SortedLinkedList linkedList = new SortedLinkedList();
      linkedList.sort(l1, r1);
   }
}
