🧱 Stack Implementation Using Java

---

🚀 Overview

This project is a console based Java application that demonstrates how a Stack works using an array.
The program provides a simple interactive menu that allows the user to push pop and display stack elements.

The stack follows the Last In First Out ( LIFO ) principle.


🛠️ How It Works

The program starts by asking the user to enter the maximum size of the stack.
After that a menu keeps running until the user chooses to exit.

All stack operations are implemented inside a dedicated Stack class while the main class is responsible for running the loop.


📦 Stack Structure

The stack is implemented using an integer array and an index pointer called top.

If top == -1 the stack is empty
If top == max - 1 the stack is full


➕ Push Operation

Adds data to the stack until it becomes full.
If the stack reaches its maximum size a stack overflow message is displayed.
```bash
public void push() {
    if (isFull()) {
        System.out.println("Stack Overflow");
        return;
    }

    System.out.print("Enter Data: ");
    int data = scanner.nextInt();
    stackArray[++top] = data;
}
```


➖ Pop Operation

Removes the last inserted element from the stack.
If the stack is empty a warning message is shown.

```bash
public void pop() {
    if (isEmpty()) {
        System.out.println("Stack is Empty");
        return;
    }

    System.out.println(stackArray[top--] + " Removed");
}
```



👀 Display Options

The program supports two display modes.

Stack View

Displays elements from top to bottom.
```bash
for (int i = top; i >= 0; i--) {
    System.out.println(stackArray[i]);
}
```

Normal View

Displays elements from bottom to top.
```bash
for (int i = 0; i <= top; i++) {
    System.out.println(stackArray[i]);
}
```

🎛️ Menu System

The menu allows the user to add remove display or exit the program.

```bash
while (true) {
    stack.choice();
}
```

▶️ How To Run
```http
javac Main3.java
```

Run
```http
java Main3
```



⚡Features

Menu driven interaction
Array based stack implementation
Handles stack overflow and empty stack cases
Beginner friendly and easy to read




📚 What You Learn

Understanding stack data structure
Array based implementation
Using loops conditions and switch statements
Building menu driven Java programs





