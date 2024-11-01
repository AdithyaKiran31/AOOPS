import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<String> buffer = new LinkedList<>();
    private final int maxSize;

    public SharedBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait(); 
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notify(); 
    }

    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        notify(); 
        return message;
    }
}
