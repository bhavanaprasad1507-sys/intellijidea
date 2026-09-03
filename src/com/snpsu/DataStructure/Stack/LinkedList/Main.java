package com.snpsu.DataStructure.Stack.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListStack {
    private Node top;
    private int size;
    LinkedListStack() {
        top = null;
        size = 0;
    }
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty() {
        return top == null;
    }
    int getSize() {
        return size;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println("Size: " + stack.getSize());
    }
}