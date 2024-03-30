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

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
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

    /**
     * Method to remove the last node from the doubly linked list and return it
     *
     * @return The removed node
     * Created on: Friday, 29 March 2024
     * Author: Kiransing bhat
     */
    Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    /**
     * Method to remove the first node from the doubly linked list and return it
     *
     * @return The removed node
     * Created on: Friday, 29 March 2024
     * Author: Kiransing bhat
     */
    Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    /**
     * Method to retrieve the node at the specified index in the doubly linked list
     *
     * @param index The index of the node to retrieve
     * @return The node at the specified index, or null if the index is out of bounds
     * Created on: Sunday, 31 March 2024
     * Author: Kiransing bhat
     */
    public Node get(int index){
        if (index <0 || index >=length){
            return null;
        }
        Node temp = head;
        if (index<length/2){
            for (int i = 0;i<index;i++){
                temp = temp.next;
            }
        }else {
            temp = tail;
            for (int i = length-1;i>index;i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    /**
     * Method to set the value of the node at the specified index in the doubly linked list
     *
     * @param index The index of the node to set the value
     * @param value The new value to set
     * @return true if the value is successfully set, false otherwise
     * Created on: Sunday, 31 March 2024
     * Author: Kiransing bhat
     */
    public boolean set(int index,int value){
        Node temp = get(index);
        if (temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
}
