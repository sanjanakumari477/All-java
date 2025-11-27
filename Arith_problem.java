import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;
        double remainder = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
            remainder = num1 % num2;
        }
        else 
        {
            System.out.println("Division and modulus not possible (division by zero).");
        }
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        }

        input.close();
    }
}
