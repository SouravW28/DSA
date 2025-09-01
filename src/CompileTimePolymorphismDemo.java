class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    } }
public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(2, 3) = " + calc.add(2, 3));                // int, int
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));          // int, int, int
        System.out.println("add(2.5, 3.5) = " + calc.add(2.5, 3.5));        // double, double
    }
}
