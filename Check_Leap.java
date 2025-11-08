import java.util.Scanner;
class LeapYear{
 
public static void main(String[]sk)
{
	
	System.out.print("Enter Any Year:");
	Scanner Year=new Scanner(System.in);
	int Y= Year.nextInt();
 
	if((Y%4==0 && Y%100!=0 || Y%400==0))
		{
	System.out.print("This year is leap year.");
				}
	else {
	System.out.print("This year is not leap year.");
	}
    	}
}
