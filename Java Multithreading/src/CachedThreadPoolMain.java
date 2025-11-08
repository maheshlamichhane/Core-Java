import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CachedThreadPoolMain {

        public static void main(String[] args) {

            // Create a cached thread pool
            ExecutorService cachedPool = Executors.newCachedThreadPool();

            // Submit 10 short-lived tasks
            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                cachedPool.submit(() -> {
                    System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // Simulate short task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " finished by " + Thread.currentThread().getName());
                });
            }

            // Shutdown the executor
            cachedPool.shutdown();
        }

}
