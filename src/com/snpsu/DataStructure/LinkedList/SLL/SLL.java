package com.snpsu.DataStructure.LinkedList.SLL;
class Node{
    int data;
    Node next;//pointing towards node obj
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;

    SLL() {
        this.head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void printSLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
class Driver {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.printSLL();
        System.out.println("Null");
    }
}