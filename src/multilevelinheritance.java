public class multilevelinheritance {
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        } }
    static class Mammal extends Animal {
        void walk() {
            System.out.println("This mammal walks on land.");
        } }
    static class Dog extends Mammal {
        void bark() {
            System.out.println("The dog barks.");
        } }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // From Animal
        dog.walk();  // From Mammal
        dog.bark();  // From Dog
    }
}
