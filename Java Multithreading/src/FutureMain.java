import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureMain {

        public static void main(String[] args) throws Exception {
            ExecutorService executor = Executors.newSingleThreadExecutor();

            Future<Integer> future = executor.submit(() -> {
                Thread.sleep(5000);
                return 10;
            });
            System.out.println("Task submitted...");
            // Do something else here
            // Get the result (blocks if not done)
            System.out.println("Thread is blocked here.......waiting for result");
            Integer result = future.get();
            System.out.println("Result: " + result);

            executor.shutdown();
        }
}
