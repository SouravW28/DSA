class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    } }
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    } }
class Cat extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Animal reference, Dog object
        Animal a2 = new Cat();  // Animal reference, Cat object
        a1.sound();  // Calls Dog's version of sound()
        a2.sound();  // Calls Cat's version of sound()
    }
}
