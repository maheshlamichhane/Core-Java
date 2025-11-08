public class DaemonThreadMain {

        public static void main(String[] args) {
            Thread daemonThread = new Thread(() -> {
                while (true) {
                    System.out.println("Daemon thread running in background...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Mark the thread as daemon
            daemonThread.setDaemon(true);
            daemonThread.start();

            // Main thread (user thread)
            System.out.println("Main thread is finishing...");

            // JVM will exit here after main thread ends, daemon thread stops automatically
        }

}
