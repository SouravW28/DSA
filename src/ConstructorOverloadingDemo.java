class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0; }
    Student(String name) {
        this.name = name;
        age = 0;}
    Student(String name, int age) {
        this.name = name;
        this.age = age;}
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);  }  }
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();                  // No-arg constructor
        Student s2 = new Student("Riddhi");           // One-arg constructor
        Student s3 = new Student("Ram", 20);         // Two-arg constructor
        s1.display();
        s2.display();
        s3.display();
    }
}

