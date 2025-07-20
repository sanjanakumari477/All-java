import java.util.Scanner;
public class Rectangle {

public static void main(String[]args)
{
	Scanner sc=new Scanner (System.in);
System.out.println("enter the lengh of Rectangle=");
	int lengh=sc.nextInt();
System.out.println("enter the breath of Rectangle=");
	int breath=sc.nextInt();

	int area=lengh*breath;
	int perimeter=2*lengh+breath;

System.out.println("Area  ="+area);

System.out.println("Perimeter	="+perimeter);

}
    }

 



