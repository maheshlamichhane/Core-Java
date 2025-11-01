import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte b = 1;
        byte c = 3;
        byte d = (byte)(b+c);

//        System.out.println(12/0);
//        System.out.println(12.0f/0.0f);
//        System.out.println(13.443443/0);
          System.out.println(0.0/0.0);

          Double dd = Double.NaN;
          System.out.println(dd);
          String s;

          String s1 = new String("mahesh");
          String s2 = new String("mahesh");
          System.out.println(s1.equals(s2));

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        System.out.println(6 & 4);
        System.out.println(6 | 4);
        System.out.println(6 ^ 4);


    }
}