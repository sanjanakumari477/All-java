import java.util.Scanner;

public class NumberCheck {

    // Function to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Function to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check even or odd
        if (isEven(number)) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // Check prime
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        input.close();
    }
}
