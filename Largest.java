import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Logic to find the largest number
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Output the result
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        sc.close();
    }
}



//OUTPUT
Enter first number: 10
Enter second number: 25
Enter third number: 15
The largest number is: 25

