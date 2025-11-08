public class ObjectLevelLockMain {

        public static void main(String[] args) {
            Display d1 = new Display();
            Display d2 = new Display();

            Thread t1 = new Thread(() -> d1.showMessage("Hello"));
            Thread t2 = new Thread(() -> d2.showMessage("World"));

            t1.start();
            t2.start();
        }

}

class Display {
    synchronized void showMessage(String msg) {
        System.out.println("[" + msg + "]");
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}
