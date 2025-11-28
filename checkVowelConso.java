import java.util.Scanner;
   class VowelConsonent {
      public static void main (String[]args)
       {
	Scanner S=new Scanner(System.in);
        System.out.print("enter any character = ");
        char ch= S.next().charAt(0);
          
 	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
     	 
	       {
            System.out.println("This character is vowel");
                  }
             
              else 
           {
			  
            System.out.println("This character is consonent");
                   }
                }
          }
