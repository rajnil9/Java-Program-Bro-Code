import java.util.*;
class a8
{ 
  // THREAD PROBLEM
  public static void main(String[]args) throws InterruptedException /*the sleep() method informs
   that the sleep  was interupted by throwing an  uptedException */
{
  
  int start;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number for countdown to start: ");
  start=sc.nextInt();

  for(int i=start;i>=0;i--)
  {
    System.out.println(i);
    Thread.sleep(500);  // we use this function to delay the loop by setting the timer which is in ms
  }
   System.out.println("HAPPY NEW YEAR");
   sc.close();
   
}

}
