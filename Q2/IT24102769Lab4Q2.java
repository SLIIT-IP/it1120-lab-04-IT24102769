import java.util.Scanner;
public class IT24102769Lab4Q2
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     int num1,num2,prcnt1,prcnt2;
  
     System.out.println("Please enter exam marks(out of 100):");
     num1=sc.nextInt();

     if(num1>100 || num1<=0)
     {
       System.out.println("Invalid input for exam marks. Terminating program.");
     }
     else
     
     System.out.println("Please enter lab submission mark(out of 100): ");
     num2=sc.nextInt();
     
     if(num2>100 || num2<=0)
     {
       System.out.println("Invalid input for lab submission marks. Terminating program.");
     }
 
      System.out.println("Please enter the percentage given for the exam:");
      prcnt1=sc.nextInt();
      
     System.out.println("Please enter the percentage given for the lab submission:");
     prcnt2=sc.nextInt();
  
     double no1=((num1*prcnt1)/100)+((num2*prcnt2)/100);
    
     if((prcnt1+prcnt2)>100)
     {
      System.out.println("The percentage must add up to 100.Terminating program.");
     }
     else
    {
     System.out.println("Final Exam Marks is:"+num1);
    }
  }
}
  
     
    