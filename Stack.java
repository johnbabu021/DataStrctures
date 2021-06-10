public class Stack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public Node top;

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;

        }

    }

    public void pop() {
        if (top == null) {
            return;
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(70);
        stack.push(90);

        stack.display();

    }

}