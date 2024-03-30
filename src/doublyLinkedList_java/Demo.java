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
        list.append(60);
        list.append(70);
        list.append(80);
        list.printList();
        System.out.println(list.get(5).value);
        list.set(5,600);
        System.out.println(list.get(5).value);
        list.printList();
    }
}
