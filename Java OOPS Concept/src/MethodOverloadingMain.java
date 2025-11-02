public class MethodOverloadingMain {
    public static void main(String[] args) {
        m1(10);
        m1(20l);
        m1((short)1);
    }

    public static void m1(int x){
        System.out.println("int method");
    }

    public static void m1(long y){
        System.out.println("long method");
    }
}
