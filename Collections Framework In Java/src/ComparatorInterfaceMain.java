import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 23));
        employees.add(new Employee(102, "Bob", 20));
        employees.add(new Employee(103, "Charlie", 25));

        System.out.println("Sorted by name (Comparator):");
        Collections.sort(employees, new NameComparator());
        for (Employee e : employees) System.out.println(e);

        System.out.println("\nSorted by age (Comparator):");
        Collections.sort(employees, new AgeComparator());
        for (Employee e : employees) System.out.println(e);
    }
}

class Employee {
    int id;
    String name;
    int age;

    Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.age - e2.age;
    }
}
