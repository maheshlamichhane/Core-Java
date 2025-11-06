import java.util.LinkedHashMap;

public class LinkedHashMapMain {

    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add key-value pairs
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(5, "E");
        map.put(4, "D");

        // Display entries
        System.out.println("LinkedHashMap (Insertion Order):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

         /*
             Map(I)
              |
            HashMap(C)
              |
            LinkedHashMap(C)
         */
    }
}
