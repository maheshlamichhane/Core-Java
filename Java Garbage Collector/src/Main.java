//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Eligible for gc using nullifying
        String x = new String("10");
        x = null;

        // Eligible for gc using reassigning variable
        String y = new String("20");
        y = new String("10");

        // Eligible for gc for variable inside method automatically eligible
        // for problem like iceland of isolation

        // Calling gc programatically
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: "+runtime.totalMemory());
        System.out.println("Free memory: "+runtime.freeMemory());
        runtime.gc();
    }
}