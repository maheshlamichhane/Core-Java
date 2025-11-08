import java.util.concurrent.Exchanger;
public class ExchangerMain {

        public static void main(String[] args) {
            Exchanger<String> exchanger = new Exchanger<>();

            new Thread(() -> {
                try {
                    String data = "Data from Thread A";
                    System.out.println("Thread A sending: " + data);
                    String received = exchanger.exchange(data);
                    System.out.println("Thread A received: " + received);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    String data = "Data from Thread B";
                    System.out.println("Thread B sending: " + data);
                    String received = exchanger.exchange(data);
                    System.out.println("Thread B received: " + received);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

}
