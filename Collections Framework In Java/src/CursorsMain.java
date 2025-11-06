import java.util.*;

public class CursorsMain {

    public static void main(String[] args) {
        //Enumeration only traverse in forward and no add and delete in collections
        Vector<String> vector = new Vector<>();
        vector.add("Mahesh");
        vector.add("Nabin");
        vector.add("Akash");

        Enumeration<String> en = vector.elements();
//        Enumeration<String> en2 = Collections.enumeration(vector);
        System.out.println("Using Enumeration:");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        // Iterator only traverse in forward direction and only can remove not add
        ArrayList<String> list = new ArrayList<>();
        list.add("Mahesh");
        list.add("Nabin");
        list.add("Akash");

        Iterator<String> it = list.iterator();
        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if(s.equals("Nabin")) {
                it.remove(); // remove element safely
            }
        }

        System.out.println("After removal: " + list);


        // List iterator traverse in both direction and can add and delete update.
        ArrayList<String> listt = new ArrayList<>();
        listt.add("Mahesh");
        listt.add("Nabin");
        listt.add("Akash");

        ListIterator<String> listIt = listt.listIterator();
        System.out.println("Forward Traversal:");
        while(listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward Traversal:");
        while(listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

        // Modify elements
        listIt = listt.listIterator();
        while(listIt.hasNext()) {
            String s = listIt.next();
            if(s.equals("Akash")) {
                listIt.set("Rohan");
            }
        }
        System.out.println("After modification: " + list);
    }
}
