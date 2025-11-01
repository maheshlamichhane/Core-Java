public class VarArgsMain {

    public static void main(String[] args) {
        printNumbers(10,20,30);
    }

    public static void printNumbers(int... numbers) {
        int i=0;
        for (int number : numbers) {
            System.out.println(number);
            System.out.println(numbers[i]);
            i++;
        }
    }
}
