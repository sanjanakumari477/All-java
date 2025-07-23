import java.util.Scanner;

public class ReverseNumber {
    // Function to reverse the number
    static int reverseNumber(int num) {
        int reverse = 0;
        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Call the function and print result
        int reversed = reverseNumber(number);
        System.out.println("Reversed number is: " + reversed);
        
      
    }
}
