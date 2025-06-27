import java.util.Scanner;

public class BCAStudentResultt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];
        int total = 0;
        boolean pass = true;

        System.out.println("Enter marks for 6 subjects:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered! Marks should be between 0 and 100.");
                return;
            }

            if (marks[i] < 35) {
                pass = false; 
            }

            total += marks[i];
        }

        double percentage = total / 6.0;

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total + " / 600");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (pass) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        scanner.close();
    }
}
