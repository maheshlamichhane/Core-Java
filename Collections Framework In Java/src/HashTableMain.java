import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs
        table.put(101, "Alice");
        table.put(102, "Bob");
        table.put(103, "Charlie");

        // Access values
        System.out.println("Value for key 101: " + table.get(101));

        // Remove an entry
        table.remove(102);

        // Print all entries
        System.out.println("\nHashtable elements:");
        for (Integer key : table.keySet()) {
            System.out.println(key + " -> " + table.get(key));
        }

         /*
             Map(I)
              |
            HashTable(C)
         */
    }
}
