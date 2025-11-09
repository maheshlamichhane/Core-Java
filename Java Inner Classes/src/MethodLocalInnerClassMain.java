public class MethodLocalInnerClassMain {


        void display() {
            System.out.println("Inside display() method of Outer class");

            // Method Local Inner Class
            class Inner {
                void show() {
                    System.out.println("Inside show() method of Method Local Inner Class");
                }
            }

            // Creating object of Inner class inside the same method
            Inner i = new Inner();
            i.show();
        }

        public static void main(String[] args) {
            MethodLocalInnerClassMain outer = new MethodLocalInnerClassMain();
            outer.display();
        }

}
