import java.util.Scanner;
public class IT24102769Lab4Q1
{
  public static void main(String[]args)
   {
     
    Scanner input= new Scanner(System.in);
    int num1;
    System.out.println("Enter a number:");
    num1=input.nextInt();
    
    if(num1>0)
    {
      System.out.println("The number is: Positive");
    }
    else if(num1<0)
    {
      System.out.println("The number is: Negative");
    }
    else
    {
      System.out.println("The number is: Zero"); 
    }
   }
}