public class AnonymousInnerClassWithClassMain {

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }
    public static void main(String[] args) {
            Animal dog = new Animal() {
                @Override
                void makeSound() {
                    System.out.println("Bark! Bark!");
                }
            };

            dog.makeSound(); // Output: Bark! Bark!
        }

}

