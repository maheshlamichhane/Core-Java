import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LinkedListMain {

    public static void main(String[] args) {

        // Doubly linked list representation using linkedlist
        LinkedList<String> list = new LinkedList<>();
        list.add("Mahesh");
        list.add("Nabin");
        list.add("Akash");
        System.out.println(list.get(0));
        for(String s : list){
            System.out.println(s);
        }
        System.out.println(list.get(2));

        // stack implementation using doubly linked list
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

//         Queue implementation using doubly linked list
        Queue<String> queue = new LinkedList<>();
        queue.add("Mahesh");
        queue.add("Nabin");
        queue.add("Akash");
        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // Deque implementation with linked list
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque: " + deque);
        System.out.println("Removed from front: " + deque.removeFirst()); // C
        System.out.println("Removed from rear: " + deque.removeLast());   // D
        System.out.println("Deque after removals: " + deque); // [A, B]
        System.out.println("Front element: " + deque.peekFirst()); // A
        System.out.println("Rear element: " + deque.peekLast());   // B
        System.out.println("Iterating over deque:");
        for (String s : deque) {
            System.out.println(s);
        }









        //Iterator(I)
//           |
//        Collection(I)
//           |
//        List(I)  Deque(I)
//           |       |
//        LinkedList(C)
    }
}
