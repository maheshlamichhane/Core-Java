import java.util.concurrent.locks.StampedLock;
public class StampedLockMain {


            private final StampedLock lock = new StampedLock();
            private int data = 0;

    public static void main(String[] args) {
        StampedLockMain example = new StampedLockMain();
        example.write(100);
        example.read();
    }

            public void write(int value) {
                long stamp = lock.writeLock(); // acquire write lock
                try {
                    System.out.println(Thread.currentThread().getName() + " writing...");
                    data = value;
                } finally {
                    lock.unlockWrite(stamp);
                }
            }

            public void read() {
                long stamp = lock.tryOptimisticRead(); // non-blocking optimistic read
                int value = data;

                // validate to ensure no write occurred
                if (!lock.validate(stamp)) {
                    stamp = lock.readLock();
                    try {
                        value = data;
                    } finally {
                        lock.unlockRead(stamp);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " read: " + value);
            }
}
