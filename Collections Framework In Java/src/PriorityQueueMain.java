import java.util.PriorityQueue;

public class PriorityQueueMain {

    public static void main(String[] args) {
        // Integer priority queue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("PriorityQueue elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        /*
           Iterator(I)
              |
           Collection(I)
              |
           Queue(I)
              |
           PriorityQueue(c)
         */
    }
}
