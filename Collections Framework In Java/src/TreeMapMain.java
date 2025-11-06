import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        // Default sort for tree map with integer
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(50, "Alice");
        map.put(20, "Bob");
        map.put(70, "Charlie");
        map.put(10, "David");
        map.put(40, "Eve");

        // Iterating through entries
        System.out.println("\nIterating TreeMap:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Default sort for tree map with string
        TreeMap<String, String> map2 = new TreeMap<>();
        map2.put("a", "Alice");
        map2.put("b", "Bob");
        map2.put("c", "Charlie");
        map2.put("d", "David");
        map2.put("e", "Eve");

        System.out.println("\nIterating TreeMap:");
        for (String key : map2.keySet()) {
            System.out.println(key + " -> " + map2.get(key));
        }

        // Sorting using comparator
        TreeMap<String, String> map3 = new TreeMap<>(Comparator.reverseOrder());
        map3.put("a", "Alice");
        map3.put("b", "Bob");
        map3.put("c", "Charlie");
        map3.put("d", "David");
        map3.put("e", "Eve");

        System.out.println("\nIterating TreeMap:");
        for (String key : map3.keySet()) {
            System.out.println(key + " -> " + map3.get(key));
        }

        System.out.println("\nTraversal using entrySet():");
        for (Map.Entry<String, String> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

         /*
             Map(I) SortedMap(I)
              |     |
            TreeMap(C)
         */






    }
}
