package ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5); // Create a queue of capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front item is: " + queue.peek());

        queue.dequeue();
        System.out.println("Front item after dequeue is: " + queue.peek());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will show that the queue is full
    }
}
