package stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        s1.pop();
        s1.getTop();
        s1.getHeight();
        s1.printStack();


    }
}
