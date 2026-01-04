
import java.util.Scanner;

class Main4 {

    public static void main(String[] args) {
        SLinkedList stack = new SLinkedList();

        stack.push(); // 1
        stack.push(); // 2
        stack.push(); //3

        stack.clear();

        stack.push(); // 4
        stack.push(); // 5
        stack.push(); //6

        stack.pop(); // 5 4
        stack.pop(); // 5 4
        stack.pop(); // 5 4

        stack.traverse();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}

class Node {

    int data;
    Node next;

    Node(int Data) {
        this.data = Data;
        this.next = null;
    }
}

class SLinkedList {

    Node top;
    Scanner scanner = new Scanner(System.in);

    public void push() {
        System.out.print("Enter The Data : ");
        int data = scanner.nextInt();

        Node n = new Node(data);

        if (top == null) {
            top = n;
        } else {
            n.next = top;
            top = n;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty (pop)");
            return;
        } else {
            top = top.next;
        }

    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty already");
            return;
        }
        while (top != null) {
            top = top.next;
        }
        System.out.println("The Stack is Cleared Successfully");
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty (Traverse)");
            return;
        }

        Node current = top;
        System.out.print("The Data inside The Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

}
