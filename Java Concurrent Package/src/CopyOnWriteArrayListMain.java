import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMain {

    public static void main(String[] args) throws InterruptedException {
        // Thread-safe list
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add initial elements
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Thread 1: Iterates over the list
        Thread reader = new Thread(() -> {
            System.out.println("Reader thread started...");
            for (String item : list) {
                System.out.println("Reader sees: " + item);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
            System.out.println("Reader finished.\n");
        });

        // Thread 2: Modifies the list while reader is iterating
        Thread writer = new Thread(() -> {
            System.out.println("Writer thread started...");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
            list.add("Four");
            System.out.println("Writer added: Four");
            try { Thread.sleep(150); } catch (InterruptedException e) {}
            list.remove("Two");
            System.out.println("Writer removed: Two");
            System.out.println("Writer finished.\n");
        });

        // Start both threads
        reader.start();
        writer.start();

        // Wait for both to finish
        reader.join();
        writer.join();

        System.out.println("Final list: " + list);

        /*
            Iterable(I)
                |
            Collection(I)
                |
               List(I)
                |
               CopyOnWriteArrayList(C)
         */
    }
}
