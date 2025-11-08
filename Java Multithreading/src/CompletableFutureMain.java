import java.util.concurrent.*;
public class CompletableFutureMain {


        public static void main(String[] args) throws Exception {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
                System.out.println("Running task...");
                sleep(2000);
                return 10;
            });

            future
                    .thenApply(result -> result * 2)
                    .thenAccept(result -> System.out.println("Final result: " + result))
                    .exceptionally(ex -> {
                        System.out.println("Error: " + ex.getMessage());
                        return null;
                    });

            System.out.println("Main thread is free to do other work...");

            Thread.sleep(3000); // wait for async task to complete
        }

        private static void sleep(long ms) {
            try { Thread.sleep(ms); } catch (InterruptedException e) { }
        }

}
