import java.util.concurrent.CountDownLatch;
public class CountDownLatchMain {
        public static void main(String[] args) throws InterruptedException {

            CountDownLatch latch = new CountDownLatch(3);

            for (int i = 1; i <= 3; i++) {
                new Thread(new Worker(latch, i)).start();
            }

            System.out.println("Main thread waiting for workers...");
            latch.await();  // Wait until count becomes 0
            System.out.println("All workers finished. Proceeding...");
        }
}

class Worker implements Runnable {
    private final CountDownLatch latch;
    private final int workerId;

    Worker(CountDownLatch latch, int workerId) {
        this.latch = latch;
        this.workerId = workerId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + workerId + " is working...");
            Thread.sleep(1000 * workerId);
            System.out.println("Worker " + workerId + " done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();  // Decrement count
        }
    }
}
