public class Inheritancedemo {
    static class Animal{
        void eat(){
            System.out.println("This Animal Eats Food.");
        }
        void sleep(){
            System.out.println("Then Animal Sleep.");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("The dog barks.");
        }
    }
    public static void main(String[] args) {
        Dog mydog=new Dog();

        mydog.eat();
        mydog.sleep();
        mydog.bark(); }
}
