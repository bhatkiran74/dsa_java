package linkedList_java;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode= new Node(value);
        head = newNode;
        tail = newNode;
        length=1;

    }
    void append(int value){
        Node newNode = new Node(value);

        if (length==0){
            head=newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void getHead(){
        System.out.println("Head : "+head.value);
    }
    void getTail(){
        System.out.println("Head : "+tail.value);
    }
    void getLength(){
        System.out.println("Length :"+length);
    }

}
