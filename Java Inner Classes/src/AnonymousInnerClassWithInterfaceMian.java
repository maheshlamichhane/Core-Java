public class AnonymousInnerClassWithInterfaceMian {

    interface Greeting {
        void sayHello();
    }

        public static void main(String[] args) {
            // Creating an anonymous inner class that implements Greeting
            Greeting greet = new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("Hello from anonymous inner class!");
                }
            };

            greet.sayHello(); // Output: Hello from anonymous inner class!
        }

}
