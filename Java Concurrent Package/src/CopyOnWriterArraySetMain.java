import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriterArraySetMain {
    public static void main(String[] args) throws InterruptedException {
        // Create a thread-safe CopyOnWriteArraySet
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        // Add initial elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Thread 1: Iterates over the set
        Thread reader = new Thread(() -> {
            System.out.println("Reader thread started...");
            for (String fruit : set) {
                System.out.println("Reader sees: " + fruit);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
            System.out.println("Reader finished.\n");
        });

        // Thread 2: Modifies the set while reader is iterating
        Thread writer = new Thread(() -> {
            System.out.println("Writer thread started...");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
            set.add("Mango");
            System.out.println("Writer added: Mango");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
            set.remove("Banana");
            System.out.println("Writer removed: Banana");
            System.out.println("Writer finished.\n");
        });

        // Start both threads
        reader.start();
        writer.start();

        // Wait for both to complete
        reader.join();
        writer.join();

        // Print final set
        System.out.println("Final Set: " + set);
    }
}
