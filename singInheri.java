class MarksInput {
    int sub1, sub2, sub3, sub4, sub5;

    void inputMarks(int a, int b, int c, int d, int e) {
        sub1 = a;
        sub2 = b;
        sub3 = c;
        sub4 = d;
        sub5 = e;
    }
}

class Result extends MarksInput {
    void calculateResult() {
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.inputMarks(85, 90, 80, 70, 75);
        obj.calculateResult();
    }
}
