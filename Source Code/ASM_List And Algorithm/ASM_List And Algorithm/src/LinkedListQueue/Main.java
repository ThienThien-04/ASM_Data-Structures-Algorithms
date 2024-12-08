package LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue(); // Create a new queue

        queue.enqueue(10); // Output: 10 enqueued to queue
        queue.enqueue(20); // Output: 20 enqueued to queue
        queue.enqueue(30); // Output: 30 enqueued to queue
        System.out.println("Front item is: " + queue.peek()); // Output: Front item is: 10

        queue.dequeue(); // Output: 10 dequeued from queue
        System.out.println("Front item after dequeue is: " + queue.peek()); // Output: Front item after dequeue is: 20

        queue.enqueue(40); // Output: 40 enqueued to queue
        queue.enqueue(50); // Output: 50 enqueued to queue
    }
}
