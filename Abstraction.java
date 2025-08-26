// Abstract class
abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method (no body)
    abstract double area();

    // Concrete method
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Subclass 1
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    double area() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        circle.displayColor();
        System.out.println("Circle Area: " + circle.area());

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}
