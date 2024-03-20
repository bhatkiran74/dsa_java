package linkedList_java;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.printList();
        list.removeFirst();
        list.printList();
        list.append(10);
        list.printList();
    }
}
