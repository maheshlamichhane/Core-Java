import java.util.LinkedHashSet;

public class LinkedHashSetMain {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Z");
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        /*
          Iterable(I)
              |
          Collection(I)
              |
             Set(I)
              |
            HashSet(C)
              |
            LinkedHashSet(C)
         */

    }
}
