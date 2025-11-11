//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.reflect.*;
public class Main {

        public static void main(String[] args) throws Exception {
            Class<?> cls = Class.forName("Person");

            // Create object
            Constructor<?> cons = cls.getConstructor(String.class, int.class);
            Object obj = cons.newInstance("Alice", 30);

            // Access private field
            Field field = cls.getDeclaredField("name");
            field.setAccessible(true);
            field.set(obj, "Bob");

            // Invoke private method
            Method method = cls.getDeclaredMethod("sayHello");
            method.setAccessible(true);
            method.invoke(obj);
        }

}

class Person {
    private String name;
    private int age;

    public Person() {}
    public Person(String name, int age) { this.name = name; this.age = age; }

    private void sayHello() {
        System.out.println("Hello, my name is " + name+" and age is "+age);
    }
}