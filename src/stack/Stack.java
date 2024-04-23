package stack;
/**
 * Stack.java
 * Author: Kiransing bhat
 * Description: This class implements a stack data structure in Java.
 **/
public class Stack {
    private Node top;
    private int height;
    class Node {
        int value;
        Node next;
        Node(int value) {this.value = value;}
    }
    /**
     * Constructs a new stack with a single node containing the given value.
     * @param value The value to be stored in the new node.
     */
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    /**
     * Print the values of all nodes in the stack from top to bottom.
     * This method iterates through the stack and prints the value of each node.
     */
    public void printStack() {
        Node temp = top;
        while (top != null) {
            System.out.println("Value : " + top.value);
            top = top.next;
        }
    }

}
