public class Employee {

    private int id;
    private String name;
    private static String collegeName;

    public Employee(int id,String name,String collegeName) {
        this.id = id;
        this.name = name;
        Employee.collegeName = collegeName;
    }

    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
