import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // search is fast
        System.out.println(set.contains("A"));
        /*
          Iterable(I)
              |
          Collection(I)
              |
             Set(I)
              |
            HashSet(C)
         */
    }
}
