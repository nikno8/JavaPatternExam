package task_10;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int num = queue.take();
                if (num == -1) {
                    System.out.println("Consumer stopped");
                    break;
                }
                System.out.println("Consumed: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}