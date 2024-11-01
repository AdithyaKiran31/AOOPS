import java.util.LinkedList;
import java.util.Queue;

// Bounded Buffer Class
class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    // Constructor to set the capacity of the buffer
    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Method for producer to add an item
    public synchronized void produce(int item) throws InterruptedException {
        // Wait if the buffer is full
        while (buffer.size() == capacity) {
            wait(); // Producer waits until there is space in the buffer
        }
        buffer.add(item); // Add the produced item to the buffer
        System.out.println("Produced: " + item);
        notify(); // Notify the consumer that an item is available
    }

    // Method for consumer to remove an item
    public synchronized int consume() throws InterruptedException {
        // Wait if the buffer is empty
        while (buffer.isEmpty()) {
            wait(); // Consumer waits until there is an item to consume
        }
        int item = buffer.poll(); // Remove the consumed item from the buffer
        System.out.println("Consumed: " + item);
        notify(); // Notify the producer that space is available
        return item;
    }
}