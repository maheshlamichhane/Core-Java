public class ThreadPriorityMain {

        public static void main(String[] args) {
            DemoThread t1 = new DemoThread("HighPriority");
            DemoThread t2 = new DemoThread("LowPriority");

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);

            t1.start();
            t2.start();
        }

}

class DemoThread extends Thread {
    public DemoThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
        }
    }
}
