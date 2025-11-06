import java.util.*;

public class ArrayListMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");


        // random access
        System.out.println(list.get(0));

        // using list iterator
        System.out.println("Using List Iterator");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // using iterator
        System.out.println("Using Iterator");
        Iterator<String> iterable = list.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }

        // using for each loop
        System.out.println("Using For Enhanced For  Loop");
        for(String s: list){
            System.out.println(s);
        }

        // using for loop
        System.out.println("Using For Loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // using java 8 for each
        System.out.println("Using java 8 foreach");
        list.forEach(System.out::println);

        // using streams
        System.out.println("Using streams");
        list.stream().forEach(System.out::println);

        // using parallel streams
        System.out.println("Using parallel streams");
        list.parallelStream().forEach(System.out::println);

        // using Enumeration
        System.out.println("Using Enumerations");
        Enumeration<String> enumeration = Collections.enumeration(list);
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

//        Iterator(I)
//           |
//        Collection(I)
//           |
//        List(I)  RandomAccess(I)
//           |       |
//          ArrayList(C)


    }
}

