import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolMain {

        public static void main(String[] args) {

            // Create a fixed thread pool with 3 threads
            ExecutorService fixedPool = Executors.newFixedThreadPool(3);

            // Submit 6 tasks to the thread pool
            for (int i = 1; i <= 6; i++) {
                int taskId = i;
                fixedPool.submit(() -> {
                    System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " finished by " + Thread.currentThread().getName());
                });
            }

            // Shutdown the executor
            fixedPool.shutdown();
        }

}
