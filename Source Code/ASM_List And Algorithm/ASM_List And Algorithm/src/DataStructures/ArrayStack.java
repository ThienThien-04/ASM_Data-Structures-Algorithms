package DataStructures;

public class ArrayStack {
    private int maxSize;  // Maximum size of the stack
    private int[] stackArray;  // Array to hold stack elements
    private int top;  // Index of the top element

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stackArray[++top] = value;  // Increment top and add value
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;  // Return -1 if stack is empty
        } else {
            return stackArray[top--];  // Return top value and decrement top
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;  // Return -1 if stack is empty
        } else {
            return stackArray[top];  // Return top value without removing it
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}