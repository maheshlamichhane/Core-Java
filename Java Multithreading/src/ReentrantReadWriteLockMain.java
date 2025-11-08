import java.util.concurrent.locks.ReentrantReadWriteLock;
public class ReentrantReadWriteLockMain {

        private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
        private final ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
        private final ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();
        private int data = 0;


    public static void main(String[] args) {
        ReentrantReadWriteLockMain example = new ReentrantReadWriteLockMain();
        Runnable writer = () -> example.writeData(42);
        Runnable reader = example::readData;

        new Thread(writer, "Writer").start();
        new Thread(reader, "Reader1").start();
        new Thread(reader, "Reader2").start();
    }

        public void writeData(int value) {
            writeLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " writing...");
                data = value;
            } finally {
                writeLock.unlock();
            }
        }

        public void readData() {
            readLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " reading: " + data);
            } finally {
                readLock.unlock();
            }
        }
}
