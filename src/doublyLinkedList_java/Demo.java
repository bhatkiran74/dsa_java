package doublyLinkedList_java;

public class Demo {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList(10);

        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.append(60);
        list.append(70);
        list.append(80);
        list.printList();
        list.insert(0,5);
        list.insert(9,90);
        list.insert(4,35);
        list.printList();
    }
}
