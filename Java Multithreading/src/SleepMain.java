public class SleepMain {
        public static void main(String[] args) {
            SleepExample t1 = new SleepExample();
            SleepExample t2 = new SleepExample();

            t1.start();
            t2.start();
        }
}

class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
