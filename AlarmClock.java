import java.time.LocalTime;
public class AlarmClock implements Runnable 
{
  private final LocalTime alarmTime;

  AlarmClock(LocalTime alarmTime)
  {
    this.alarmTime=alarmTime;
  }

  @Override
  public void run() {
    
    while(LocalTime.now().isBefore(alarmTime))
    {
        try
        {
          Thread.sleep(1000);
          int hours=LocalTime.now().getHour();
          int mins=LocalTime.now().getMinute();
          int sec=LocalTime.now().getSecond();
          System.out.printf("%02d:02d:02d\n" , hours, mins , sec);
        } 
        catch(InterruptedException e)
        {
            System.out.println("Thread was interrupted");
        }
    }
    
  }
  
}
