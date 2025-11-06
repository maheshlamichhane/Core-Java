import java.util.Stack;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Mahesh");
        vector.add("Nabin");
        System.out.println(vector);

        // vector are thread safe but arraylist are not

        // Stack class
        Stack<Integer> stack = new Stack<>();
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println(stack.get(0));

        //        Iterator(I)
//           |
//        Collection(I)
//           |
//        List(I)  RandomAccess(I)
//           |       |
//        Vector(C)
     //      |
     //   Stack(C)
    }
}


