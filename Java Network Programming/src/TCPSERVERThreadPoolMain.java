import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TCPSERVERThreadPoolMain {


        private static final int PORT = 1234;
        private static final int MAX_THREADS = 2;

        public static void main(String[] args) {
            System.out.println("Opening port... " + PORT + "\n");

            ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                System.out.println("Server started. Waiting for clients...");

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("New client connected: " + clientSocket.getInetAddress());

                    // Submit client handling to the executor
                    executor.submit(() -> handleClient(clientSocket));
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Server shutting down...");
            }
        }

        private static void handleClient(Socket clientSocket) {
            try (
                    Scanner input = new Scanner(clientSocket.getInputStream());
                    PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true)
            ) {
                int messageCount = 0;
                String message;

                while ((message = input.nextLine()) != null && !message.equals("*** CLOSE ***")) {
                    System.out.println("[" + clientSocket.getInetAddress() + "] Message received: " + message);
                    messageCount++;
                    output.println("MESSAGE " + messageCount + ": " + message);
                }

                output.println(messageCount + " MESSAGES RECEIVED.");
                System.out.println("Client disconnected: " + clientSocket.getInetAddress());

            } catch (IOException e) {
                System.out.println("Client error: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    System.out.println("Error closing client socket: " + e.getMessage());
                }
            }
        }

}