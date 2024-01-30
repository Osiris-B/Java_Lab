import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(item);
            System.out.println("Producing item " + item);

            notifyAll();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }

            int item = buffer.removeFirst();
            System.out.println("Consuming item " + item);

            notifyAll();
        }
    }
}

class Producer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sharedBuffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sharedBuffer.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class lab7 {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);

        Thread producer = new Thread(new Producer(sharedBuffer));
        Thread consumer = new Thread(new Consumer(sharedBuffer));

        producer.start();
        consumer.start();
    }
}
