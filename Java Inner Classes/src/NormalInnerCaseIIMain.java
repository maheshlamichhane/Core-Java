public class NormalInnerCaseIIMain {

        int x = 10;

        // Regular Inner Class
        class Inner {
            void m1() {
                System.out.println("Inner class method m1() called");
                System.out.println("Accessing Outer class variable x = " + x);
            }
        }

        // Case-II: Accessing inner class code from instance area of outer class
        public void m2() {
            // Since this is an instance method, we can directly create Inner object
            Inner i = new Inner();
            i.m1();
        }

        public static void main(String[] args) {
            NormalInnerCaseIIMain o = new NormalInnerCaseIIMain();
            o.m2();
        }

}
