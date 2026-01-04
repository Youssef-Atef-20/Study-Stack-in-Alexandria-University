import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter The Maximum Number of data That will be In the Array: ");
        int size = scanner.nextInt();
        Stack S = new Stack(size);

        while (true) {
            S.Choice();
        }

    }
}

class Stack {

    Scanner scanner2 = new Scanner(System.in);
    int size;
    int top;
    int[] stackArray;

    Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push() {
        int data;
        while (!isFull()) {
            System.out.print("Please Enter The Data: ");
            data = scanner2.nextInt();
            stackArray[++top] = data;
            System.out.println(data + " Pushed");
        }
        System.out.println("Stack Overflow! We Can't Push any More Data in This Array ");

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stackArray[top--] + " Removed");

    }

    public void DisplayLikeStack() {
        if (isEmpty()) {
            System.out.println("This Array is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println("Data: " + stackArray[i]);
            if (i == 0) {
                System.out.println("The End");
            }
        }
        System.out.println("That's What Look Like inside The Stack");

    }

    public void DisplayNormal() {
        if (isEmpty()) {
            System.out.println("This Array is Empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.println("Data: " + stackArray[i]);
            if (i == top) {
                System.out.println("The End");
            }
        }
        System.out.println("That's What Look in the Normal Condition");

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
                break;

            case 4:
                System.out.println("Program Ended");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");

        }

    }

}
