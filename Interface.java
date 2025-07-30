// Interface
interface Shape {
    double calculateArea();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, width;

    // Constructor
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Implement calculateArea()
    public double calculateArea() {
        return length * width;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Implement calculateArea()
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(4);

        // Output areas
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Circle: " + circ.calculateArea());
    }
}
