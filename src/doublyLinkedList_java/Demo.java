package doublyLinkedList_java;

public class Demo {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList(10);

        list.getHead();
        list.getTail();
        list.getLength();
        list.printList();

        list.append(20);
        list.append(30);
        list.printList();

    }
}
