import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMain {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1: adds elements
        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("T1-" + i, i);
                System.out.println("Writer1 added: " + "T1-" + i);
            }
        });

        // Thread 2: adds elements
        Thread writer2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("T2-" + i, i * 10);
                System.out.println("Writer2 added: " + "T2-" + i);
            }
        });

        // Thread 3: reads elements
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Reader sees: " + map);
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
        });

        // Start all threads
        writer1.start();
        writer2.start();
        reader.start();

        // Wait for all threads to finish
        writer1.join();
        writer2.join();
        reader.join();

        System.out.println("\nFinal Map: " + map);
    }

    /*
        Map(I)
          |
        ConcurrentMap(I)
          |
        ConcurrentHashMap(C)
     */
}
