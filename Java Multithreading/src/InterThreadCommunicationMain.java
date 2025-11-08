public class InterThreadCommunicationMain {


        public static void main(String[] args) {
            SharedResource resource = new SharedResource();

            // Producer Thread
            Thread producer = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                }
            });

            // Consumer Thread
            Thread consumer = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                }
            });

            producer.start();
            consumer.start();
        }

}

class SharedResource {
    private int data;
    private boolean hasData = false;

    synchronized void produce(int value) {
        while (hasData) { // if data is already produced, wait
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify();
    }

    synchronized void consume() {
        while (!hasData) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}
