public class ClassLevelLockMain {
        public static void main(String[] args) {
            Displayy d1 = new Displayy();
            Displayy d2 = new Displayy(); // two objects but same class-level lock

            Thread t1 = new Thread(() -> d1.showMessage("Hello"));
            Thread t2 = new Thread(() -> d2.showMessage("World"));

            t1.start();
            t2.start(); // executes one after another, as class-level lock is shared
        }

}
class Displayy {
    static synchronized void showMessage(String msg) {
        System.out.println("[" + msg + "]");
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}
