interface Vehicle {
    void start();  // abstract method
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with a key.");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a self-start button.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();     // Interface reference to Car object
        Vehicle myBike = new Bike();   // Interface reference to Bike object

        myCar.start();   // Output: Car is starting with a key.
        myBike.start();  // Output: Bike is starting with a self-start button.
    }
}

