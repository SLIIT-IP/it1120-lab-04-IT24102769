import java.util.Scanner;
public class IT24102769Lab4Q3
{
  public static void main(String[]args)
   {
     
    Scanner input= new Scanner(System.in);
    int num1;
    String result;

    System.out.println("Enter a number:");
    num1=input.nextInt();
    
    result=(num1>0)?"The number is: Positive" :
           (num1<0)?"The number is: Negative" :
           "The number is: Zero ";
    System.out.println(result);
   }
}