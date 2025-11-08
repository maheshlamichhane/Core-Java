import java.util.concurrent.Semaphore;
public class SermaphoreMain {

        public static void main(String[] args) {
            Semaphore semaphore = new Semaphore(2); // Only 2 threads allowed

            for (int i = 1; i <= 5; i++) {
                new Thread(new WorkerThread(semaphore, i)).start();
            }
        }

}

class WorkerThread implements Runnable {
    private final Semaphore semaphore;
    private final int id;

    WorkerThread(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); // Get a permit
            System.out.println("Thread " + id + " acquired permit.");
            Thread.sleep(2000);
            System.out.println("Thread " + id + " releasing permit.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit
        }
    }
}
