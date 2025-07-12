package AlarmClockProgram;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
public class Main
{
  public static void main(String[] args)
   {
    

    Scanner sc=new Scanner(System.in);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime alarmTime=null;
    String filepath="AlarmClockProgram\\Xylophone.wav";

    while( alarmTime==null)
    {
    try{ 
      System.out.print("Enter time in HH:MM:SS ->");
        String inputTime = sc.nextLine();

       alarmTime=LocalTime.parse(inputTime,f);

       System.out.println("Alarm Time set for: "+ alarmTime);

    }

    catch(DateTimeParseException e)
    {
      System.out.println("Invalid Input .Use HH:MM:SS format");
    }
    }


    AlarmClock ac=new AlarmClock(alarmTime, filepath ,sc);
    Thread th=new Thread(ac);
    th.start();
  }
}

