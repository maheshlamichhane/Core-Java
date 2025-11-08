public class JoinMain {


        public static void main(String[] args) throws InterruptedException {
            JoinExample t1 = new JoinExample();
            JoinExample t2 = new JoinExample();

            t1.start();
            t1.join(); // Main thread waits for t1 to finish

            t2.start(); // t2 starts only after t1 completes
            t2.join();

            System.out.println("All threads finished");
        }

}

class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
        }
    }
}
