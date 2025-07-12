package AlarmClockProgram;
import java.time.LocalTime;
public class AlarmClock implements Runnable 
{
  private final LocalTime alarmTime;
  private final String filepath;

  AlarmClock(LocalTime alarmTime , String fp)
  {
    this.alarmTime=alarmTime;
    this.filepath=fp;
  }

  @Override
  public void run() {
    
    while(LocalTime.now().isBefore(alarmTime))
    {
        try
        {
          Thread.sleep(1000);

          LocalTime now= LocalTime.now();
          System.out.printf("\r%02d:02d:02d\n" , now.getHour(), now.getMinute(), now.getSecond());
        } 
        catch(InterruptedException e)
        {
            System.out.println("Thread was interrupted");
        }
    }

    System.out.println("\n*ALARM NOISES*");
    playsound();

    
  }


private void playsound()
{
  filepath
}

}
