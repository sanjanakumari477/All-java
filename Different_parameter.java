class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

// 2 parameter 
    double add(double a, double b) {
        return a + b;
    }

    //  3  parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    //  Different parameter order
    String add(String a, int b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 int: " + calc.add(10, 20));
        System.out.println("Sum of 2 double: " + calc.add(5.5, 4.5));
        System.out.println("Sum of 3 int: " + calc.add(1, 2, 3));
        System.out.println("Concatenation: " + calc.add("Number is ", 100));
    }
}
