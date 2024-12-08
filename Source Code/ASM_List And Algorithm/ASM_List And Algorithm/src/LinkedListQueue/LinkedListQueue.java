package LinkedListQueue;

class Node {
    int data; // Data part of the node
    Node next; // Reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, next is null
    }
}

public class LinkedListQueue {
    private Node front; // Reference to the front node
    private Node rear;  // Reference to the rear node
    private int size;   // Current size of the queue

    // Constructor to initialize the queue
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item); // Create a new node
        if (rear == null) { // If the queue is empty
            front = rear = newNode; // Set both front and rear to the new node
        } else {
            rear.next = newNode; // Link the new node to the last node
            rear = newNode; // Move the rear to the new node
        }
        size++; // Increase the size
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (front == null) { // If the queue is empty
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1; // Return -1 if the queue is empty
        }
        int item = front.data; // Get the front item
        front = front.next; // Move front to the next node
        if (front == null) { // If the queue is now empty
            rear = null; // Also set rear to null
        }
        size--; // Decrease the size
        System.out.println(item + " dequeued from queue");
        return item; // Return the dequeued item
    }

    // Method to get the front item of the queue
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 if the queue is empty
        }
        return front.data; // Return the front item
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current size of the queue
    public int getSize() {
        return size;
    }
}