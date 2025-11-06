import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {

        // Default Sorting for integer
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        System.out.println(numbers);

        // Default Sorting with string
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("S");
        stringSet.add("B");
        stringSet.add("C");
        System.out.println(stringSet);

        // Sorting using Comparator
        TreeSet<Integer> compSorting = new TreeSet<>(Comparator.reverseOrder());
        compSorting.add(50);
        compSorting.add(10);
        compSorting.add(30);
        compSorting.add(20);
        compSorting.add(40);
        System.out.println(compSorting);

        // Sorting using Comparable
        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(new Customer(101, "Alice", 22));
        customers.add(new Customer(102, "Bob", 20));
        customers.add(new Customer(103, "Charlie", 25));

        System.out.println("Students sorted by age:");
        for (Customer c : customers) {
            System.out.println(c);
        }


          /*
          Iterable(I)
              |
          Collection(I)
              |
             Set(I)
              |
            SortedMap(I)
              |
            TreeSet(C)
         */

    }
}

class Customer implements Comparable<Customer> {
    int id;
    String name;
    int age;

    Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Natural ordering by age
    @Override
    public int compareTo(Customer other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return id + " " + name + " (" + age + ")";
    }


}
