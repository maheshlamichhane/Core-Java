import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 23));
        students.add(new Student(102, "Bob", 20));
        students.add(new Student(103, "Charlie", 25));

        Collections.sort(students);
        System.out.println("Sorted by age (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Natural ordering by age
    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
