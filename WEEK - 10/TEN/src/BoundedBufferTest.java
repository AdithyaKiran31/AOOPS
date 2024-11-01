public class BoundedBufferTest {
    public static void main(String[] args) {
        // Create a bounded buffer with a capacity of 10
        BoundedBuffer buffer = new BoundedBuffer(10);

        // Start producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start(); // Start the producer thread
        consumer.start(); // Start the consumer thread
    }
}
 
