//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        int x = 11;
//        ;;;;;;;;;;;;;;;;;;;
//        assert(x > 10) : ++x;
//        ;;;;;;;;;;;;;;;;;;;
//        System.out.println(x);

//        int x = 11;
//        ;;;;;;;;;;;;;;;;;;;
//        assert(x > 10) : m1();
//        ;;;;;;;;;;;;;;;;;;;
//        System.out.println(x);




    int x = 10;
    boolean flag = false;
        if(x > 5){
            System.out.println("x is greater than 5");
            flag = true;
            assert flag : "true";
        }
        else {
            System.out.println("x is less than 5");
            flag = false;
            assert flag : "x is less than 5";
        }
    }

    public static int m1(){
        return 8888;
    }
}