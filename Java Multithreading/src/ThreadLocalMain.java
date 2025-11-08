public class ThreadLocalMain {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadLocal(), "Thread-1");
        Thread t2 = new Thread(new MyThreadLocal(), "Thread-2");
        Thread t3 = new Thread(new MyThreadLocal(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThreadLocal implements Runnable {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    @Override
    public void run() {
        threadLocal.set((int) (Math.random() * 100D)); // each thread sets its own value
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName() + " -> " + threadLocal.get());
    }
}
