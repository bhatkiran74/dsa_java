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
        list.append(40);
        list.append(50);
        list.getLength();
        list.printList();
        list.removeFirst();
        list.getLength();
        list.printList();


    }
}
