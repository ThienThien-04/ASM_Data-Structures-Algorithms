package DataStructures;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack functionStack = new ArrayStack( 10);

        // Simulating function calls by pushing values onto the stack
        System.out.println("Pushing function calls onto the stack:");
        functionStack.push(1);  // Call to function1
        functionStack.push(2);  // Call to function2
        functionStack.push(3);  // Call to function3

        // Peek the top function call
        System.out.println("Current function on top of stack: " + functionStack.peek());

        // Pop function calls from the stack
        System.out.println("Popping function calls from the stack:");
        while (!functionStack.isEmpty()) {
            System.out.println("Returning from function call: " + functionStack.pop());
        }

        // Attempt to pop from an empty stack
        functionStack.pop();
    }
}
