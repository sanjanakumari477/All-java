import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows for triangle
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
