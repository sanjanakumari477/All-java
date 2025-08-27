import java.util.Scanner;
	class Alphabet{
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);	
	System.out.print("enter any character=");
	
	char ch= sc.next().charAt(0);
	if(ch>='A'&& ch<='Z')
             {
	    System.out.println("It is Uppercase");
             }
	else 
            {
           System.out.println("It is Lowecase");

            }
      }
 }
