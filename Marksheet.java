class Marksheet
{
String name;
int roll_no;
float marks;
               // contructor
        Marksheet(String name,int roll_no,float marks)
           {
              this.name=name;
              this.roll_no= roll_no;
              this.marks=marks;
           }
             // display mothod
           void display(){
             System.out.println("Name      : "+name);
            System.out.println("Roll no   : "+roll_no);
            System.out.println("Marks     : "+marks); 
            System.out.println("______________________________");
           }
  // main method 
 public static void main(String[]args)
    {
Marksheet m1=new Marksheet("Sanju",2000040,373.0f);
Marksheet m2=new Marksheet("Khushi",2000030,381.0f);
Marksheet m3=new Marksheet("Jyoti",2000008,345.0f);
Marksheet m4=new Marksheet("Anshu",2000005,328.0f);
Marksheet m5=new Marksheet("Reshma",2000028,312.0f);

// display record for each student
m1.display();
m2.display();
m3.display();
m4.display();
m5.display();

}
    }

 
