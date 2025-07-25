import java.util.Scanner;

public class StudentMarksheet {

    // Static variables
    static String name;
    static int roll;
    static int phy, chem, math, eng, hindi;
    static int total;
    static double percentage;

    // Static block 
    static {
        System.out.println("=== Welcome to Student Marksheet System ===\n");
    }

    // Static method to input data
    static void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        System.out.print("Enter marks in Physics: ");
        phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        chem = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        math = sc.nextInt();
        System.out.print("Enter marks in English: ");
        eng = sc.nextInt();
        System.out.print("Enter marks in Hindi: ");
        hindi = sc.nextInt();
    }

    // Static method to calculate total and percentage
    static void calculateResult() {
        total = phy + chem + math + eng + hindi;
        percentage = total / 5.0;
    }

    // Static method to display the marksheet
    static void displayMarksheet() {
        System.out.println("\n=== Student Marksheet ===");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + roll);
        System.out.println("----------------------------");
        System.out.println("Physics    : " + phy);
        System.out.println("Chemistry  : " + chem);
        System.out.println("Maths      : " + math);
        System.out.println("English    : " + eng);
        System.out.println("Hindi      : " + hindi);
        System.out.println("----------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage : " + percentage + "%");
    }

    // Main method
    public static void main(String[] args) {
        inputDetails();
        calculateResult();
        displayMarksheet();
    }
}
