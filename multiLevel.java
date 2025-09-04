import java.util.Scanner;

// Base class
class Student {
    String name;
    int rollNo;

    void setStudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
    }
}

// Intermediate class
class Exam extends Student {
    int[] marks = new int[5];

    void inputMarks(int[] inputMarks) {
        for (int i = 0; i < 5; i++) {
            marks[i] = inputMarks[i];
        }
    }

    void displayMarks() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }
    }
}

// Derived class
class Result extends Exam {
    int total = 0;
    double percentage;
    String grade;

    void calculate() {
        for (int mark : marks) {
            total += mark;
        }
        percentage = total / 5.0;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else grade = "D";
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Total     : " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade     : " + grade);
    }
}

// Main class
public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number : ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        r.setStudentDetails(name, rollNo);
        r.inputMarks(marks);
        r.calculate();
        System.out.println("\n----- Student Report -----");
        r.displayResult();

        sc.close();
    }
}
