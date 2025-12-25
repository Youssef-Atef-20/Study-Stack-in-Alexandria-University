🧱 Stack Implementation Using Java

🚀 Overview
This project is a console based Java application that demonstrates how a Stack works using an array
The program provides a simple interactive menu that allows the user to push pop and display stack elements easily
The stack follows the Last In First Out LIFO concept which means the last element added is the first one removed



🛠️ How It Works
The application starts by asking the user to enter the maximum size of the stack
After that a menu keeps running until the user decides to exit the program
All stack operations are handled inside a dedicated Stack class while the main method is responsible for running the program loop



📦 Stack Structure
The stack is implemented using an integer array
A variable called top is used as a pointer to track the last inserted element
If top equals -1 the stack is empty
If top equals max - 1 the stack is full



➕ Push Operation
The push operation allows the user to insert data into the stack
Data is added until the stack becomes full
When the stack reaches its maximum size a stack overflow message is displayed

➖ Pop Operation
The pop operation removes the top element from the stack
If the stack is empty a warning message is shown to the user



👀 Display Options
The program provides two display modes
Stack View displays elements from top to bottom just like a real stack
Normal View displays elements from bottom to top like a normal array



🎛️ Menu System
The menu allows the user to add elements to the stack remove one element display the stack or exit the program
The menu keeps running until the exit option is selected



⚡ Features
Clean and simple implementation
Menu driven interaction
Handles stack overflow and empty stack cases
Easy to understand and beginner friendly

📚 What You Learn
How stack data structure works
Array based stack implementation
Using loops conditions and switch statements
Building menu driven programs in Java
