public class StarvationMain {
        public static void main(String[] args) {
            Runnable lowPriorityTask = () -> {
                while (true) {
                    System.out.println("Low priority thread running...");
                }
            };

            Runnable highPriorityTask = () -> {
                while (true) {
                    System.out.println("High priority thread running...");
                }
            };

            Thread t1 = new Thread(lowPriorityTask, "Low");
            Thread t2 = new Thread(highPriorityTask, "High");

            t1.setPriority(Thread.MIN_PRIORITY);  // 1
            t2.setPriority(Thread.MAX_PRIORITY);  // 10

            t1.start();
            t2.start();
        }


}
