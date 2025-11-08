import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduledThreadPoolMain {

        public static void main(String[] args) {

            // Create a scheduled thread pool with 3 threads
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

            // 1️⃣ Task 1 - Run after a delay of 2 seconds
            scheduler.schedule(() -> {
                System.out.println("Task 1 executed after 2 seconds by " + Thread.currentThread().getName());
            }, 2, TimeUnit.SECONDS);

            // 2️⃣ Task 2 - Run repeatedly every 3 seconds, after an initial delay of 1 second
            scheduler.scheduleAtFixedRate(() -> {
                System.out.println("Task 2 (fixed rate) executed by " + Thread.currentThread().getName());
            }, 1, 3, TimeUnit.SECONDS);

            // 3️⃣ Task 3 - Run repeatedly with a fixed delay of 4 seconds between task completions
            scheduler.scheduleWithFixedDelay(() -> {
                System.out.println("Task 3 (fixed delay) executed by " + Thread.currentThread().getName());
            }, 1, 4, TimeUnit.SECONDS);

            // Stop the scheduler after 15 seconds
            scheduler.schedule(() -> {
                System.out.println("\nShutting down scheduler...");
                scheduler.shutdown();
            }, 15, TimeUnit.SECONDS);
        }

}
