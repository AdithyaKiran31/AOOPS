
class Consumer extends Thread {
    private final BoundedBuffer buffer;

    // Constructor to initialize the shared buffer
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume(); // Consume items
                Thread.sleep(1000); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}