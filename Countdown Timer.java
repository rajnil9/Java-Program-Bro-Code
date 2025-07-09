import java.util.*;
class timer
{
  public static void main(String[] args)
   {
    
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number for Countdown: ");
    int res=sc.nextInt();
    
    Timer timer=new Timer();
    TimerTask t=new TimerTask()
    {
    int c=res;
    @Override
    public void run()
     {
      
      System.out.println(c);
      c--;
      if(c<0)
      {
      System.out.println("HAPPY NEW YEAR");
      timer.cancel();
      }
      
     }
    };
   timer.schedule(t, 0, 500);
  }
}