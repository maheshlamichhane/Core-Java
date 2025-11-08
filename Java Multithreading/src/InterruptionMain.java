public class InterruptionMain {

        public static void main(String[] args) throws InterruptedException {
            InterruptThread t1 = new InterruptThread();
            t1.start();
            Thread.sleep(2000);
            t1.interrupt();
        }

}

class InterruptThread extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep");
            Thread.sleep(5000); // Sleeping for 5 seconds
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
}
