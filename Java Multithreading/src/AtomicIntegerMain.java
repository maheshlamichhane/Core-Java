import java.util.concurrent.atomic.AtomicInteger;
public class AtomicIntegerMain {


        private AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            count.incrementAndGet(); // Atomically increments and returns the new value
        }

        public int getCount() {
            return count.get();
        }

        public static void main(String[] args) throws InterruptedException {
            AtomicIntegerMain counter = new AtomicIntegerMain();

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) counter.increment();
            });

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) counter.increment();
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            System.out.println("Final Count: " + counter.getCount());
        }

}
