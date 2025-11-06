import java.util.concurrent.LinkedBlockingQueue;
public class LinkedBlockingQueueMain {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        // Producer
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    int val = queue.take();
                    System.out.println("Consumed: " + val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }

     /*
       Iterator(I)
              |
           Collection(I)
              |
           Queue(I)  BlockingQueue(I)
              |       |
           LinkedBlockingQueue(C)
     */
}
