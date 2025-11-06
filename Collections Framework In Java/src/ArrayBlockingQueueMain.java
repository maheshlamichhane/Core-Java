import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMain {

    public static void main(String[] args) throws InterruptedException {
//        // Create a queue with capacity 3
//        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
//
//        // Add elements
//        queue.put(10);
//        queue.put(20);
//        queue.put(30);
//        System.out.println("Queue after adding elements: " + queue);
//
//        // Remove elements
//        System.out.println("Removed element: " + queue.take());
//        System.out.println("Removed element: " + queue.take());
//        System.out.println("Queue after removing elements: " + queue);

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer Thread
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

        // Consumer Thread
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
           ArrayBlockingQueue(C)
     */
}
