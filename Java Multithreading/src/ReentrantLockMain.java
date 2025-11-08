import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockMain {

    private final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockMain example = new ReentrantLockMain();
        example.outer();
    }


    public void outer() {
            lock.lock();
            try {
                System.out.println("Outer method acquired lock");
                inner(); // reentrant locking
            } finally {
                lock.unlock();
            }
    }

        public void inner() {
            lock.lock(); // allowed again (same thread)
            try {
                System.out.println("Inner method acquired lock");
            } finally {
                lock.unlock();
            }
        }

}
