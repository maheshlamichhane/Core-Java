
public class YieldMain {

    public static void main(String[] args) {
                YieldExample t1 = new YieldExample();
                YieldExample t2 = new YieldExample();
                t1.start();
                t2.start();
            }
}

class YieldExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);
            Thread.yield(); // Suggests scheduler to give CPU to another thread
        }
    }
}
