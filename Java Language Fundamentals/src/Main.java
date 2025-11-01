//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 027;
        int z = 0xa1;
        char ch = 97;
        System.out.println(ch);

        int[] arr = new int[3];
        System.out.println(arr.getClass().getName());

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Employee e1 = new Employee(1,"mahesh","NCIT");
        System.out.println(e1.toString());
        Employee e2 = new Employee(2,"mahesh");
        System.out.println(e2.toString());



    }
}