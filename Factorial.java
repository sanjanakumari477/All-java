// Java Program to calculate factorial of a number using function

import java.util.Scanner;
public class FactorialProgram {

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();

        // Call the function and print the result
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        sc.close();
    }
}
