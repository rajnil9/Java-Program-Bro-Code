


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
class Alarm
{
  public static void main(String[] args)
   {
    

    Scanner sc=new Scanner(System.in);
    LocalTime alarmTime=null;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
    

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


    AlarmClock ac=new AlarmClock(alarmTime);
    Thread alarmThread=new Thread(ac);
    alarmThread.start();
  }
}

