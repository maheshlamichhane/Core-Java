public class ThreadGroupMain {

        public static void main(String[] args) {
            // Create a thread group
            ThreadGroup tg = new ThreadGroup("MyGroup");

            // Create threads belonging to this group
            Thread t1 = new Thread(tg, () -> {
                System.out.println(Thread.currentThread().getName() + " is running");
            }, "Thread-1");

            Thread t2 = new Thread(tg, () -> {
                System.out.println(Thread.currentThread().getName() + " is running");
            }, "Thread-2");

            t1.start();
            t2.start();

            // Get info about the group
            System.out.println("Active Threads: " + tg.activeCount());
            tg.list();  // prints info about the thread group
        }

}
