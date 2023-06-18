package task_10;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> queue;
    private final int maxElements;

    public Producer(BlockingQueue<Integer> queue, int maxElements) {
        this.queue = queue;
        this.maxElements = maxElements;
    }

    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < maxElements; i++) {
                int num = random.nextInt(100);
                queue.put(num);
                System.out.println("Produced: " + num);
                Thread.sleep(random.nextInt(1000));
            }
            queue.put(-1); // end of producing signal
            System.out.println("Producer stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}