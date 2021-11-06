package com.wickedshon.algorithms.topics;

/**
 * @date: 11/6/2021
 * @author: wickedShon
 * Program description: Generic Node class
 * Status: Incomplete
 * Solution time complexity:
 * Solution space complexity:
 */

public class Node<E> {
   private E value;
   private Node<E> next, left, right;


   public E getValue() {
      return value;
   }

   public void setValue(E value) {
      this.value = value;
   }

   public Node(E value) {
      this.value = value;
   }

   public void setNext(Node<E> node) {
      next = node;
   }

   public Node<E> getLeft() {
      return left;
   }

   public void setLeft(Node<E> left) {
      this.left = left;
   }

   public Node<E> getRight() {
      return right;
   }

   public void setRight(Node<E> right) {
      this.right = right;
   }

   public Node<E> getNext() {
      return next;
   }
}
