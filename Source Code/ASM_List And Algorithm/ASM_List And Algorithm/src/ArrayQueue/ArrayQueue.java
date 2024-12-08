package ArrayQueue;

public class ArrayQueue {
    private int front, rear, size;
    private final int capacity;
    private final int[] queue;

    // Constructor to create a queue of a given capacity
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0; // Initialize front and size
        this.rear = capacity - 1; // Rear is set to last index
        this.queue = new int[capacity]; // Create the queue
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item; // Add the item
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1; // Return -1 if the queue is empty
        }
        int item = queue[front]; // Get the front item
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(item + " dequeued from queue");
        return item;
    }

    // Method to get the front item of the queue
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 if the queue is empty
        }
        return queue[front]; // Return the front item
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
