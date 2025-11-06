import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        // Create a HashMap is not thread safe but hashtable is thread safe
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        map.put(104, "David");

        // Print the HashMap
        System.out.println("Initial HashMap: " + map);

        // Access values using key
        System.out.println("Value for key 102: " + map.get(102));

        // Update value
        map.put(103, "Chris"); // replaces old value
        System.out.println("After updating key 103: " + map);

        // Remove entry
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // Check if a key or value exists
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'Bob'? " + map.containsValue("Bob"));

        // Iterate through keys and values
        System.out.println("\nIterating HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

          /*
             Map(I)
              |
            HashMap(C)
         */
    }
}
