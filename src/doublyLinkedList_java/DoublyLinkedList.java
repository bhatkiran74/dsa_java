package doublyLinkedList_java;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    void getHead() {
        System.out.println("Head : " + head.value);
    }

    void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    void getLength() {
        System.out.println("Length : " + length);
    }

    void printList(){
        Node temp = head;
        while (temp.next!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}
