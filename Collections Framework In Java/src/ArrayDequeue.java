import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Insert at both ends
        deque.addFirst("A");  // Front
        deque.addLast("B");   // End
        deque.addFirst("C");  // Front

        System.out.println("Deque elements:");
        for (String s : deque) {
            System.out.println(s);
        }
        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from end: " + deque.pollLast());

        System.out.println("Deque after removal: " + deque);
    }

    /*
       Iterator(I)
              |
           Collection(I)
              |
           Queue(I)  Deque(I)
              |       |
           ArrayDeque(C)
     */
}
