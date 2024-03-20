package linkedList_java;

/**
 * LinkedList: A class representing a singly linked list.
 */
public class LinkedList {
    private Node head; // Reference to the first node in the linked list
    private Node tail; // Reference to the last node in the linked list
    private int length; // Number of nodes in the linked list

    /**
     * Inner class representing a node in the linked list.
     */
    class Node {
        int value; // Value stored in the node
        Node next; // Reference to the next node in the linked list

        /**
         * Constructor to create a new node with a given value.
         * @param value The value to be stored in the node.
         */
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * Constructor to initialize the linked list with a single node containing a given value.
     * @param value The value to be stored in the first node of the linked list.
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Append a new node with the given value to the end of the linked list.
     * @param value The value to be stored in the new node.
     */
    void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * Prepend a new node with the given value to the beginning of the linked list.
     * @param value The value to be stored in the new node.
     */
    void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /**
     * Remove and return the last node from the linked list.
     * @return The removed node or null if the list is empty.
     */
    Node removeLast() {
        if (length == 0)
            return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    /**
     * Remove and return the last node from the linked list.
     * @return The removed node or null if the list is empty.
     */
    Node removeFirst(){
        Node temp = head;
        if (length==0){
            return null;
        }
        head = head.next;
        temp.next=null;
        length--;
        if (length==0){
            tail = null;
        }
        return temp;
    }

    /**
     * Print all the values stored in the nodes of the linked list.
     */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * Print the value stored in the head node of the linked list.
     */
    void getHead() {
        System.out.println("Head : " + head.value);
    }

    /**
     * Print the value stored in the tail node of the linked list.
     */
    void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    /**
     * Print the number of nodes in the linked list.
     */
    void getLength() {
        System.out.println("Length: " + length);
    }
}