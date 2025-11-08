import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierMain {

        public static void main(String[] args) {
            int parties = 3;
            CyclicBarrier barrier = new CyclicBarrier(parties, () -> {
                System.out.println("All threads reached barrier. Continuing...");
            });

            for (int i = 1; i <= parties; i++) {
                new Thread(new Task(barrier, i)).start();
            }
        }
}

class Task implements Runnable {
    private final CyclicBarrier barrier;
    private final int id;

    Task(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + id + " working...");
            Thread.sleep(1000 * id);
            System.out.println("Thread " + id + " waiting at barrier...");
            barrier.await();  // Wait for others
            System.out.println("Thread " + id + " continues after barrier.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
