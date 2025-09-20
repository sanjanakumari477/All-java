// Multilevel Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}
class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car speeds fast");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start(); // From Vehicle
        sc.drive(); // From Car
        sc.speed(); // From SportsCar
    }
}
