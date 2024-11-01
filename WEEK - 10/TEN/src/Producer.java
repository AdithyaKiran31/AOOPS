class Producer extends Thread {
    private final BoundedBuffer buffer;

    // Constructor to initialize the shared buffer
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 0; // Item to be produced
        try {
            while (true) {
                buffer.produce(item++); // Produce items
                Thread.sleep(500); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}