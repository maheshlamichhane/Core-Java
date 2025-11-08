import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Runnable::run;
        executor.execute(() -> System.out.println("Hello Executor"));

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> future = service.submit(() -> 5 + 10);
        Future<Integer> future2 = service.submit(() -> 5 + 1);
        System.out.println(future.get()); // 15
        System.out.println(future2.get());
        service.shutdown();

        Future<String> future3 = service.submit(() -> "Hello Future");

        Executors.newCachedThreadPool();

    }
}
