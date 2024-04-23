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
    /**
     * Print the value of the top node in the stack.
     * This method prints the value of the node currently at the top of the stack.
     */
    public void getTop(){
        System.out.println("Top of stack : "+top.value);
    }
    /**
     * Print the height of the stack.
     * This method prints the number of nodes currently present in the stack.
     */
    public void getHeight(){
        System.out.println("Height of stack : "+height);
    }
    /**
     * Push a new node with the given value onto the stack.
     * This method adds a new node with the given value to the top of the stack.
     * @param value The value to be stored in the new node.
     */
    public void push(int value){
        Node newNode = new Node(value);
        if (height==0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    /**
     * Remove and return the top node from the stack.
     * This method removes the node currently at the top of the stack and returns it.
     * If the stack is empty, it returns null.
     * @return The node removed from the top of the stack, or null if the stack is empty.
     */
    public Node pop(){
        if (height==0) return null;

        Node temp = top;
        top = top.next;
        temp.next=null;
        height--;
        return temp;
    }

}
