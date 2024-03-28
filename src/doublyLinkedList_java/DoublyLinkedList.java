package doublyLinkedList_java;

/**
 * DoublyLinkedList.java
 * Author: Kiransing bhat
 * Description: This class implements a doubly linked list data structure in Java.
 **/
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Node class representing individual nodes in the doubly linked list
    class Node {
        int value;
        Node next;
        Node prev;

        // Constructor to initialize a node with a given value
        Node(int value) {
            this.value = value;
        }
    }

    // Constructor to initialize a doubly linked list with a single node
    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Method to print the value of the head node
    void getHead() {
        System.out.println("Head : " + head.value);
    }

    // Method to print the value of the tail node
    void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    // Method to print the length of the doubly linked list
    void getLength() {
        System.out.println("Length : " + length);
    }

    // Method to print all the values in the doubly linked list
    void printList() {
        Node temp = head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    // Method to append a new node with the given value to the end of the doubly linked list
    void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
}
