
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter The Maximum Number of data That will be In the Array: ");
        int max = scanner.nextInt();
        Stack S = new Stack(max);

        S.Choice();

    }
}

class Stack {

    Scanner scanner2 = new Scanner(System.in);
    int max;
    int top;
    int[] stackArray;

    Stack(int size) {
        this.max = size;
        stackArray = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public void push() {
        int data;
        while (!isFull()) {
            System.out.print("Please Enter The Data: ");
            data = scanner2.nextInt();
            stackArray[++top] = data;
            System.out.println(data + " Pushed");
        }
        System.out.println("Stack Overflow! We Can't push ");
        Choice();

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        System.out.println(stackArray[top--] + " Removed");
        Choice();
    }

    public void DisplayLikeStack() {
        if (isEmpty()) {
            System.out.println("This Array is Empty");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println("Data: " + stackArray[i]);
            if (i == 0) {
                System.out.println("The End");
            }
        }
        System.out.println("That's What Look Like inside The Stack");
        Choice();

    }

    public void DisplayNormal() {
        if (isEmpty()) {
            System.out.println("This Array is Empty");
        }

        for (int i = 0; i <= top; i++) {
            System.out.println("Data: " + stackArray[i]);
            if (i == top) {
                System.out.println("The End");
            }
        }
        System.out.println("That's What Look in the Normal Condition");
        Choice();

    }

    public void Choice() {

        System.out.println("What Do You Want to Do? \n1. Add to The Array\n2. Remove one Element from Array\n3. Display The Data in Array\n4. Exit The Program");
        int choice = scanner2.nextInt();

        switch (choice) {
            case 1:
                push();
                break;

            case 2:
                pop();
                break;

            case 3:

                System.out.print("Do You Want to Appear The Array Shape Like Stack or not? ( Y / N )");
                String choice_Display = scanner2.next().toLowerCase();

                switch (choice_Display) {
                    case "y":
                        DisplayLikeStack();
                        break;
                    case "n":
                        DisplayNormal();
                        break;
                }

            case 4:
                System.out.println("Program Ended");
                System.exit(0);

        }

    }

}
