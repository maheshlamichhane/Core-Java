import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SingleThreadPoolMain {

        public static void main(String[] args) {

            // Create a single thread executor
            ExecutorService singleThread = Executors.newSingleThreadExecutor();

            // Submit 5 tasks
            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                singleThread.submit(() -> {
                    System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // Simulate task execution
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " finished by " + Thread.currentThread().getName());
                });
            }

            // Shutdown the executor
            singleThread.shutdown();
        }

}
